#### 프론트엔드 드래프트
````html
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<!-- style -->
<style>
html, body, .container {
	height: 100%;
}

.chat-basic {
	overflow: hidden;
	padding-bottom: 100%;
	margin-bottom: -100%;
}

.chat-python {
	background-color: #034f84;
}

.chat {
	background-color: #80ced6;
}

.input-group {
	min-width: 100%;
}

.chat-input-group {
	max-width: 85%;
	min-width: 85%;
	margin-top: 10px;
	margin-bottom: 20px;
	float: left;
}

.chat-button-group {
	max-width: 14%;
	min-width: 14%;
	margin-top: 10px;
	margin-bottom: 20px;
	float: right;
	text-align: right;
	height: 90px;
}

.chat-btn {
	min-height: 100%;
	min-width: 100%;
}

.chat-group {
	margin: 0px;
}

.group-title {
	text-align: center;
	color: white;
	margin-top: 10px;
}

.button-group {
	text-align: right;
	margin-top: 10px;
	margin-bottom: 10px;
}

.python-btn {
	margin-left: 10px;
}

.top-bar {
	text-align: right;
	margin: 0px;
	background-color: #FFFFF0;
	margin: 0px;
	padding-right: 20px;
	padding-top: 3px;
	padding-bottom: 3px;
}

.vmiddle {
	vertical-align: middle;
}

.white-text {
	color: black;
}

.nav-div {
	margin-left: 20px;
}
</style>
</head>
<body>
<div class="form-group top-bar">
		<span class="nav-div"> <span class="vmiddle white-text">A : </span> <textarea id="roomKey" class="vmiddle" readonly rows="1"
				cols="15">블라블라 readonly</textarea>
		</span> <span class="nav-div"> <span class="vmiddle white-text">B
				: </span> <textarea id="name" class="vmiddle" rows="1" cols="15" placeholder="입력하셈"></textarea>
		</span>
	</div>
	<div class="container-fluid">
		<div class="row">
			<div class="col-lg-10 col-md-10 chat-basic chat-python">
				<h3 class="group-title">결과화면</h3>

			</div>

			<div class="col-lg-2 col-md-2 chat-basic chat">
				<h3 class="group-title">api들</h3>

			</div>
		</div>
	</div>

</body>
</html>
````
