/**
 * 
 */
function fnOnkeyDown(){
	if(window.event.keyCode == 13){printMessage();}
}

function printMessage(){
	//let text = document.getElementById("txt1").value;
	let text = $("#txt1").val();
//	let message = text ?? 'nothing to display';	//why is not working?
	let message = text == null || text == '' ? 'nothing to display' : text;
	$("#txtResult1").val(message);
}



