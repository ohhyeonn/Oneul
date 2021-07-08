/**
 * 
 */
 window.addEventListener("load",()=>{
	const fileInput = document.querySelector("input[type='file']");
	const fileBox = document.querySelector(".filebox");
	fileInput.oninput = ()=>{
		let file = fileInput.files[0];
		if(file.type.indexOf("image/") < 0){
			alert("이미지 형식만 사용할 수 있습니다.");
			fileInput.value="";
			return;
		}
			
		let reader = new FileReader();
		
		reader.readAsDataURL(file);
		reader.onload = (e)=>{
			console.log("reader load");
			let img = document.querySelector(".image");
			img.src = e.target.result;
			img.style.width = "90%";
			img.style.height = "200px";
			
			fileBox.insertAdjacentElement("beforebegin",img);
		};
		
			
	}
});

window.addEventListener("load",()=>{
	//과거날짜 선택 불가
	const dateInput = document.querySelector("input[type='date']");
	console.log(dateInput);
	let date = new Date();
    let year = date.getFullYear();
    let month = ("0" + (1 + date.getMonth())).slice(-2);
    let day = ("0" + date.getDate()).slice(-2);

    let today =  year + "-" + month + "-" + day;
	
	dateInput.min = today;
});

function submitBtnClick(){
	const form = document.querySelector(".form");

	const dateInput = document.querySelector("input[type='date']");
	const emotionInput = document.querySelector("input[type='radio']");
	
	let date = dateInput.value;
	let emotion = document.querySelector("#emotion").classList.value;
	
	console.log(date);
	console.log(emotion);
	if(date==""){
		alert("예약 날짜를 선택해주세요");
	}else if(emotion==""){
		alert("감정을 선택해주세요");
	}else{
		form.submit();	
	}
	
	
}

