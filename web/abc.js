/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


var submitBack;

valid ={
    username : false,
    email :false,
     password:false,
   confirm_password :false,
  
    
};

function show()
{
    a=document.getElementByClassName("B");
    a[0].disabled=true;
    submitBack = a[0].style.background;
    a[0].style.background ="rgba(0,0,0,0.5)";
    
}
function show2(a)
{
    aName=a.name;
    a.value=a.value.trim();
    aVal=a.value;
    notempty=/^\w/;
    aMsg=document.getElementById(aName+"Msg");
    
    if(notempty.test(aVal))
    {
        aMsg.innerHTML="";
        valid[aName]=true;
    }else
    {
        aMsg.innerHTML="(Required)";
        aMsg.style.color="red";
        aMsg.style.fontWeight="90";
        valid[aName]=false;
        return;
    }
    
    switch(aName)
    {
        case "password":
            if(aVal.length<4)
            {
              aMsg.innerHTML="(weak)";
        aMsg.style.color="red";
        aMsg.style.fontWeight="900";
        valid[aName]=false;   
            }
            else if(aVal.length<8)
            {
              aMsg.innerHTML="(good)";
        aMsg.style.color="yellow";
        aMsg.style.fontWeight="900";
       
            }
             else
            {
              aMsg.innerHTML="(strong)";
        aMsg.style.color="green";
        aMsg.style.fontWeight="900";
          
            }
            break;
       
                
    }
    if(valid.username && valid.email && valid.password && valid.confirm_password)
    {
        a=document.getElementById("data");
        a[0].disabled=false;
        a[0].style.background =submitBack;
    }
    else
    {
        a=document.getElementById("data");
    a[0].disabled=true;
    a[0].style.background="rgba(0,0,0,0.5)";
    }
}