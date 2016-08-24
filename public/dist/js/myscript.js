
function addComments() {
    var table = document.getElementById("mytable");
    var row = table.insertRow(0);
    var cell1 = row.insertCell(0);
    var cell2 = row.insertCell(1);
    cell1.innerHTML = "NEW CELL1";
    cell2.innerHTML = "NEW CELL2";
}
function myFunction() {
alert("salam");
    var table = document.getElementById("mytable");
	var rowCount = document.getElementById('mytable').rows.length;
    var row = table.insertRow(rowCount-1);
	var rowInput = table.insertRow(rowCount);
    var cell1 = row.insertCell(0);
   alert("salam");
    cell1.innerHTML = document.getElementById('c1').value;
	document.getElementById('c1').value = "";
  
}

function required()
{

var username = document.getElementById('username');
var password =document.getElementById('password');
var error =document.getElementById('error');
if (username.value== "")
{
username.style.borderColor ="red";
error.innerHTML ="لطفاً یک نام کاربری انتخاب کنید";
return false;
} 
else

		if(password.value==""){
			username.style.borderColor ="white";
		
			password.style.borderColor="red";
			error.innerHTML ="رمز عبور نمیتواند خالی باشد";
			return false;
		}
		
					else
						if(password.value.length <  6){
							password.style.borderColor="red";
							error.innerHTML ="رمز عبور اشتباه است.";
							username.style.borderColor ="white";
		
							return false;
						}
return true;
						else
						if(username.value != "prof" && username.value!= "student" && username.value != "admin")
						{
						username.style.borderColor ="red";
						error.innerHTML ="نام کاربری اشتباه است.";
						return false;
						}
						else
						if(username.value == "prof"){
							window.location.href ="teacher.html"
							return false;
						}
						else
						if(username.value == "student"){
						window.location.href ="student1.html"
						return false;
						}
						else
						if(username.value == "admin"){
						window.location.href ="admin.html"
						return false;
						}
						
						return false;



}
function newDoc() {
    window.location.replace("http://www.w3schools.com")
}
