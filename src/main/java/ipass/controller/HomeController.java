package ipass.controller;


import ipass.*;
import ipass.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;

/**
 * Created by joelt on 14-6-2017.
 */
@Controller
public class HomeController {

    @Autowired
    WerkgeverRepository werkgeverRepository;

    @Autowired
    KandidatenRepository kandidatenRepository;

    @Autowired
    ExamenRepository examenRepository;

    @Autowired
    LocatieRepository locatieRepository;

    @Autowired
    TijdRepository tijdRepository;

    @Autowired
    ExamenMomentRepository examenMomentRepository;

    @RequestMapping("/")
    public String welcome(Map<String, Object> model) {
        System.out.println("HELLO");
        return "home";

    }


    @RequestMapping("/inboeken")
    public String inboeken(Model model) {
        System.out.println("HELLO INBOEKEN");
        List<Kandidaten> alleKandidaten = kandidatenRepository.findAll();
        List<Examen> alleExamens = examenRepository.findAll();
        List<Locatie> alleLocaties = locatieRepository.findUniqueLocations();
        List<Tijd> alleTijden = tijdRepository.findAll();
        System.out.println(alleKandidaten);
        System.out.println(alleExamens);
        System.out.println(alleLocaties);
        System.out.println(alleTijden);
        model.addAttribute("kandidaten", alleKandidaten);
        model.addAttribute("examens", alleExamens);
        model.addAttribute("locaties", alleLocaties);
        model.addAttribute("tijden", alleTijden);
        return "inboeken";
    }

    @RequestMapping("/account_kandidaat")
    public String account_kandidaat(Map<String, Object> model) {
        System.out.println("HELLO KANDIDATENACCOUNT");

        Kandidaten kandidaten = new Kandidaten();
        model.put("kandidaten", kandidaten);
        return "account_kandidaat";

    }

    @RequestMapping("/account_werkgever")
    public String account_werkgever(Map<String, Object> model) {
        System.out.println("HELLO WERKGEVER");

        Werkgever werkgever = new Werkgever();
        System.out.println(werkgever.toString());
        model.put("werkgever", werkgever);

        return "account_werkgever";

    }

    @RequestMapping("/agendas_kandidaten")
    public String agendas_kandidaten(Model model) {
        System.out.println("HELLO AGENDAS");
        List<Kandidaten> alleKandidaten = kandidatenRepository.findAll();
        System.out.println(alleKandidaten);
        model.addAttribute("kandidaten", alleKandidaten);


        return "agenda's_kandidaten";

    }

    @RequestMapping("doSaveWerkgever")
    public String saveWerkgever(@Valid Werkgever werkgever, BindingResult bindingResult, RedirectAttributes redirectAttributes) {

        System.out.println("Saving");
        System.out.println(bindingResult.toString());

        if (bindingResult.hasErrors()) {
            return "account_werkgever";
        }

        werkgeverRepository.save(werkgever);

        return "redirect:/";
    }

    @RequestMapping("doSaveKandidaten")
    public String saveKandidaten(@Valid Kandidaten kandidaten, BindingResult bindingResult, RedirectAttributes redirectAttributes) {

        System.out.println("Saving kandidaten");
        System.out.println(bindingResult.toString());

        if (bindingResult.hasErrors()) {
            return "account_kandidaat";
        }

        Kandidaten tmp = kandidatenRepository.findByBSN(kandidaten.getBSN());

        if (tmp != null) {
            System.out.println("Dubbel BSN, dit BSN staat al gerigistreerd. Registreer een kandidaat met een ander BSN");
            redirectAttributes.addAttribute("bsnError", "1");
            return "redirect:account_kandidaat";
        } else {
            kandidatenRepository.save(kandidaten);
        }

        return "redirect:inboeken";
    }

    @RequestMapping("doSaveExamenMoment")
    public String saveExamenMoment(@Valid ExamenMoment examenMoment, BindingResult bindingResult, RedirectAttributes redirectAttributes) {

        System.out.println("Saving");
        System.out.println(bindingResult.toString());

        if (bindingResult.hasErrors()) {
            return "inboeken";
        }

        examenMomentRepository.save(examenMoment);

        return "redirect:agendas_kandidaten";
    }
}
