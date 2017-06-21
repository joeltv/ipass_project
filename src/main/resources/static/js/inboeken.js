/**
 * Created by joelt on 20-6-2017.
 */
    function myFunction() {
        var mycars = new Array();
        mycars[0]='Herr';
        mycars[1]='Frau';


    var options = '';
    var length = mycars.length

        for (var i = 0; i < length; i++) {
            options += '<option value="' + mycars[i] + '" />'
        }
        document.getElementById('locaties').innerHTML = options;
    }
