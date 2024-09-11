function OwnerSignup(){
    window.location.href="../OwnerSignup.html";
}
document.getElementById("ownersignin").style.cursor='pointer';
document.getElementById("ownersignin").style.color='blue';
function OwnerSignin(){
    window.location.href="../OwnerSignin.html";
}
document.getElementById("ownersignup").style.cursor='pointer';
document.getElementById("ownersignup").style.color='blue';

function OwnerSignUp(){
    window.location.href="../OwnerSignup.html";
}
function FinderSignin(){
    window.location.href="../FinderSignin.html";
}

function FinderSignup(){
    window.location.href="../FinderSignup.html";

}
// 
document.addEventListener('DOMContentLoaded', function () {
    var popupBtn = document.getElementById('popupBtn');
    var popup = document.getElementById('popup');
    var closeBtn = document.getElementsByClassName('close')[0];

    popupBtn.onclick = function() {
        popup.style.display = 'flex';
    }

    closeBtn.onclick = function() {
        popup.style.display = 'none';
    }

    window.onclick = function(event) {
        if (event.target == popup) {
            popup.style.display = 'none';
        }
    }
});