function enviarMail() {
	$.post("/Home/sendEmail", {
		user: document.getElementById("user").value
	}, function (data, error) {
		alert("Email enviado exitosamente");
	});
}
