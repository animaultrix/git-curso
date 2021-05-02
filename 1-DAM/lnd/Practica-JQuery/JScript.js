// Editar formulario
function enviarFormulario() {	
	var nombre = $("#nombre").val();
	var apellidos = $("#apellidos").val();
	var pass = $("#pass").val();
	var rPass = $("#rPass").val();
	
	$("input").keyup(function(){
		var nombre2 = $("#nombre").val();
		var apellidos2 = $("#apellidos").val();
		var pass2 = $("#pass").val();
		var rPass2 = $("#rPass").val();

		if (nombre2.length <= 0) {
			$("#descripcionNombre").removeClass('d-none');
			$("#descripcionNombre").addClass('text-danger fw-bolder');
			$("#nombre").addClass('is-invalid border-3');
			$("#descripcionNombre").html('Debe introducir un nombre');		
		} else {
			$("#descripcionNombre").removeClass('d-none text-danger');
			$("#descripcionNombre").addClass('text-success fw-bolder');
			$("#nombre").addClass('is-valid border-3')
			$("#nombre").removeClass('is-invalid');
			$("#descripcionNombre").html('¡Nombre valido!');		
		}
		if (apellidos2.length <= 0) {
			$("#descripcionApellidos").removeClass('d-none');
			$("#descripcionApellidos").addClass('text-danger fw-bolder');
			$("#apellidos").addClass('is-invalid border-3');
			$("#descripcionApellidos").html('Debe introducir apellidos');
		} else {
			$("#descripcionApellidos").removeClass('d-none text-danger');
			$("#descripcionApellidos").addClass('text-success fw-bolder');
			$("#apellidos").addClass('is-valid border-3');
			$("#apellidos").removeClass('is-invalid');
			$("#descripcionApellidos").html('¡Apellidos validos!');
		}
		if (pass2.length < 8) {		
			$("#descripcionPassword").removeClass('text-success');
			$("#descripcionPassword").addClass('text-danger fw-bolder');		
			$("#descripcionPassword").html('La contraseña debe tener al menos 8 dígitos');
			$("#pass").addClass('is-invalid border-3');
			$("#pass").removeClass('is-valid');
			//Eliminar en rPass si pass < 8	
			$("#rPass").removeClass('is-valid');
			$("#rPass").removeClass('is-invalid');
			$("#descripcionRPassword").html('');
		} else {
			$("#descripcionPassword").removeClass('text-danger');
			$("#descripcionPassword").addClass('text-success fw-bolder');
			$("#descripcionPassword").html('¡La contraseña es valida!');
			$("#pass").addClass('is-valid border-3');
			$("#pass").removeClass('is-invalid');
			if (pass2 != rPass2){
				$("#descripcionRPassword").removeClass('text-success');
				$("#descripcionRPassword").addClass('text-danger fw-bolder');		
				$("#descripcionRPassword").html('Las contraseñas no son iguales');
				$("#rPass").addClass('is-invalid border-3');
				$("#rPass").removeClass('is-valid');			
			}else{
				$("#descripcionRPassword").removeClass('text-danger');
				$("#descripcionRPassword").addClass('text-success fw-bolder');
				$("#descripcionRPassword").html('¡La contraseña es valida!');
				$("#rPass").addClass('is-valid border-3');
				$("#rPass").removeClass('is-invalid');
			}
		}		
	});		
	if (nombre.length <= 0) {
		$("#descripcionNombre").removeClass('d-none');
		$("#descripcionNombre").addClass('text-danger fw-bolder');
		$("#nombre").addClass('is-invalid border-3');
		$("#descripcionNombre").html('Debe introducir un nombre');		
	} else {
		$("#descripcionNombre").removeClass('d-none text-danger');
		$("#descripcionNombre").addClass('text-success fw-bolder');
		$("#nombre").addClass('is-valid border-3')
		$("#nombre").removeClass('is-invalid');
		$("#descripcionNombre").html('¡Nombre valido!');		
	}
	if (apellidos.length <= 0) {
		$("#descripcionApellidos").removeClass('d-none');
		$("#descripcionApellidos").addClass('text-danger fw-bolder');
		$("#apellidos").addClass('is-invalid border-3');
		$("#descripcionApellidos").html('Debe introducir apellidos');
	} else {
		$("#descripcionApellidos").removeClass('d-none text-danger');
		$("#descripcionApellidos").addClass('text-success fw-bolder');
		$("#apellidos").addClass('is-valid border-3');
		$("#apellidos").removeClass('is-invalid');
		$("#descripcionApellidos").html('¡Apellidos validos!');
	}
	if (pass.length < 8) {		
		$("#descripcionPassword").removeClass('text-success');
		$("#descripcionPassword").addClass('text-danger fw-bolder');		
		$("#descripcionPassword").html('La contraseña debe tener al menos 8 dígitos');
		$("#pass").addClass('is-invalid border-3');
		$("#pass").removeClass('is-valid');			
	} else {
		$("#descripcionPassword").removeClass('text-danger');
		$("#descripcionPassword").addClass('text-success fw-bolder');
		$("#descripcionPassword").html('¡La contraseña es valida!');
		$("#pass").addClass('is-valid border-3');
		$("#pass").removeClass('is-invalid');
		if (pass != rPass){
			$("#descripcionRPassword").removeClass('text-success');
			$("#descripcionRPassword").addClass('text-danger fw-bolder');		
			$("#descripcionRPassword").html('Las contraseñas no son iguales');
			$("#rPass").addClass('is-invalid border-3');
			$("#rPass").removeClass('is-valid');			
		}else{
			$("#descripcionRPassword").removeClass('text-danger');
			$("#descripcionRPassword").addClass('text-success fw-bolder');
			$("#descripcionRPassword").html('¡La contraseña es valida!');
			$("#rPass").addClass('is-valid border-3');
			$("#rPass").removeClass('is-invalid');
		}
	}
	//Formulario todo correcto
	if(nombre.length > 0 && apellidos.length > 0 && pass.length >= 8 && pass == rPass){
		$(".formulario section div").removeClass('border-light');
		$(".formulario section div").addClass('border-success');
		$("button").removeClass('btn-outline-light');
		$("button").addClass('btn-outline-success');
	}else{
		$(".formulario section div").removeClass('border-success');
		$(".formulario section div").addClass('border-light');
		$("button").removeClass('btn-outline-success');
		$("button").addClass('btn-outline-light');
		//Animación 'error en formulario'
		$(".formulario").animate({
			marginRight: "100px",
			marginLeft: "-100px"
		},100,function () { 
			$(".formulario").animate({
				marginLeft: "200px",
				marginRight: "-200px"
			},200,function (){
				$(".formulario").animate({
					marginRight: "0px",
					marginLeft: "0px"
				},100)
			})
		 });
	}
}
//Animacón aparición del formulario
$(document).ready(function () {
	window.sr =  ScrollReveal();
      sr.reveal('.formulario', {
        duration: 3000,
        origin: 'top', 
        distance: '100px' 
    });	
});

