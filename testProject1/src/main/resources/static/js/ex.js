/**
 * 순수 자바스크립트형식 작성해줄수있고 , jquery 형식도 넣어줄 수 있는 공간
 */
//<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>


//<button onclick="btn()">연결테스트</button> 클릭했을 때 나오는 기능
function btn(){
	alert("클릭되었습니다.");
}


/*
 <button id="btn">연결테스트</button>
 클릭했을 때 나오는 기능
 */

document.querySelector("#btn").addEventListener("click", btn);

// jquery 형식으로 변경
$(document).ready(function(){
	$("#btn").click(btn);
});