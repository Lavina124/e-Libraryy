/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


function show1()
{
    var fn=document.forms["rform"]["username"].value;
     var fp=document.forms["rform"]["email"].value;
      var fc=document.forms["rform"]["password"].value;
       var fb=document.forms["rform"]["confirm_password"].value;
        
    if(fn==null||fn=="")
    {
        alert("username required!");
        return false;
    }
if(fp==null||fp=="")
    {
        alert("email required!");
        return false;
    }
if(fc==null||fc=="")
    {
        alert("passoword required");
        return false;
    }
 if(fb==null||fb=="")
    {
        alert(" required!");
        return false;
    }
    }