function billcal()
{
var belowHun=2.96;
var aboveHun=5.56;
var noOfUnits=document.getElementById("units").value
var name=document.getElementById("cname").value
var custno=document.getElementById("no").value
var cmail=document.getElementById("mail").value
var charge;
	if(noOfUnits<=100)
	{
		charge=noOfUnits*belowHun;
	}
	else
	{
		charge=noOfUnits*aboveHun;
	}
alert("Consumer No: "+custno+"\nConsumer Name: "+name+"\nEmail Address: "+cmail+"\nNumber of Units: "+noOfUnits+"\nElectricity Charge: "+charge);
}