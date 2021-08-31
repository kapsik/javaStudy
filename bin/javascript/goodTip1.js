/**
 * 
 */
function fnOnkeyDown(id){
	if(window.event.keyCode == 13){printMessage(id);}
}


function printMessage(id){
	let text = $("#"+id).val();
	if(id == "txt1"){
		//let text = document.getElementById("txt1").value;
		//let message = text ?? 'nothing to display';	//why is not working?
		let message = text == null || text == '' ? 'nothing to display' : text;
		$("#txtResult1").val(message);
	}
	
	else if(id == "txt2"){
		let textArr = text.split("");
		let textArrNew = [];
		for (var i = 0; i < textArr.length; i++) {
			let textNew = textArr[i];
			if(textNew % 2 == 0){
				textArrNew.push(textNew);
			}
			$("#txtResult2").val(textArrNew.join(""));
		}
		
		
	}
}



