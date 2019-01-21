<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>home page</title>
</head>
<body>
	<h1>Home page</h1>
	<textarea rows="" cols="" id="t"></textarea>
	<button onclick="send()">Send</button>
	<script type="text/javascript">
		var socket = new WebSocket(
				'ws://localhost:8080/springwebsocketannotation/myhandler');
		socket.onmessage = function(message) {
			console.log(message);
			alert(message.data);
		}
		function send() {
			var message = document.getElementById('t').value;
			socket.send(message);
		}
	</script>
</body>
</html>