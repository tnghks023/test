<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>TEST</title>
</head>
<body>

<table id="out-table" border="3">

		<tr>
			<th>글번호</th>
			<th>글제목</th>
			<th>조회수</th>
		</tr>
		
		

	</table>

<script type="text/javascript">
const btn = document.getElementById('btn');
const out_table = document.getElementById('out-table');


const addToTableOut  =  (board) => {
	var line = '<tr>';
	const param = '?bno=' +board.bno;
	line += '<tr>';
	line += '<td>' + board.bno + '</td>';
	line += '<td><a href="http://localhost:8080/test/home/aop_cont'+param +'">' + board.btitle + '</a></td>';
	line += '<td>' + board.bhit + '</td>';
	line += '</tr>';
	
	out_table.innerHTML += line;	
}

	const xhttp = new XMLHttpRequest();	
	
	xhttp.addEventListener('readystatechange', (e) => {
		const readyState = e.target.readyState;
		const httpStatus = e.target.status;
		
		if(readyState == 4 && httpStatus == 200) {
			const boardList  =  JSON.parse(e.target.responseText);
			console.log(boardList);
			boardList.forEach(function(board){
				addToTableOut(board);
			});	
		}
				
	});
	
	xhttp.open('GET', '/test/testList', true);
	xhttp.send();


</script>
</body>
</html>