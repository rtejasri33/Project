function validateSignUp(){

    var num = document.getElementById("Phone_No").value;
    var mail = document.getElementById("Mail_Id").value;
    var password = document.getElementById("Password").value;
    var ConfirmPassword = document.getElementById("Confirm_Password").value;

    var regxNum = /[7 - 9]\d{9}/;
    var regxmail = /^([a-zA-z0-9\.-]+)@([a-zA-z0-9]+).com$/ 

    if(regxNum.test(num) && regxmail.test(mail) && password == ConfirmPassword){
        document.getElementById("jText").innerHTML = "Sign Up Successfully";
        document.getElementById("jText").style.color = "green";
    }
    else if(!(regxNum.test(num))){
        
        document.getElementById("jText").innerHTML = "Invalid Phone Number";
        document.getElementById("jText").style.color = "red";
    }
    else if(!(regxmail.test(mail))){
        document.getElementById("jText").innerHTML = "Invalid Mail ID";
        document.getElementById("jText").style.color = "red";
    }
    else if(password != ConfirmPassword){
        document.getElementById("jText").innerHTML = "Password not matched";
        document.getElementById("jText").style.color = "red";
    }

}

function validateSignIn(){

    var mail = document.getElementById("Mail_Id").value;
    var password = document.getElementById("Password").value;

    var regxmail = /^([a-zA-z0-9\.-]+)@([a-zA-z0-9]+).com$/ 

    if(regxmail.test(mail) && password != ""){
        document.getElementById("jText").innerHTML = "Sign In Successfully";
        document.getElementById("jText").style.color = "green";
    }
    else if(password == "") {
        document.getElementById("jText").innerHTML = "Enter Password to Sign In";
        document.getElementById("jText").style.color = "red";
    }
    else{
        document.getElementById("jText").innerHTML = "Invalid Mail_ID";
        document.getElementById("jText").style.color = "red";
    }
}

