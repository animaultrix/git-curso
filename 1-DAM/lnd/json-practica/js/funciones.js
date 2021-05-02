function leerJSON() {
	var filasFarmacia = "";
	var filasParadasDeTaxi;
	var filasHoteles;
	
	$.ajax({
		type:"GET",
		url: "json/farmacias.json",
		success: function(farmacias) {				
			$.each(farmacias['docs'], function(indice, farmacia){
				filasFarmacia += '<tr>';
				
				filasFarmacia += '	<td>';
				filasFarmacia += '		'+farmacia.NOMBRE;
				filasFarmacia += '	</td>';
				
				filasFarmacia += '	<td>';
				filasFarmacia += '		'+farmacia.TELEFONO;
				filasFarmacia += '	</td>';
				
				filasFarmacia += '	<td>';
				filasFarmacia += '		'+farmacia.DIRECCION;
				filasFarmacia += '	</td>';
				
				filasFarmacia += '	<td>';
				filasFarmacia += '		<a target="_blank" href="https://maps.google.com/?q='+farmacia["geometry"]["coordinates"][1]+','+farmacia["geometry"]["coordinates"][0]+'" class="btn btn-info">Ver ubicación</a>';
				filasFarmacia += '	</td>';
				
				filasFarmacia += '</tr>';
			});
			
			$("#filasFarmacia").html(filasFarmacia);
		}, 		
	   dataType: "json"
	});
	$.ajax({
		type: "GET",
		url: "json/paradasDeTaxi.json",		
		data: "taxis",
		dataType: "json",
		success: function (taxis) {
			$.each(taxis['docs'], function (indexInArray, taxi) { 
				filasParadasDeTaxi += '<tr>';

				filasParadasDeTaxi += '	<td>';
				filasParadasDeTaxi += '		'+taxi.Barrio;
				filasParadasDeTaxi += '	</td>';
				
				filasParadasDeTaxi += '	<td>';
				filasParadasDeTaxi += '		'+taxi.DIRECCION;
				filasParadasDeTaxi += '	</td>';
				
				filasParadasDeTaxi += '	<td>';
				filasParadasDeTaxi += '		<a target="_blank" href="https://maps.google.com/?q='+taxi["geometry"]["coordinates"][1]+','+taxi["geometry"]["coordinates"][0]+'" class="btn btn-info">Ver ubicación</a>';
				filasParadasDeTaxi += '	</td>';

				filasParadasDeTaxi += '</tr>';				
			});
			$("#filasParadasDeTaxi").html(filasParadasDeTaxi);
		}
	});
	$.ajax({
		type: "GET",
		url: "json/hoteles.json",
		data: "hoteles",
		dataType: "json",
		success: function (hoteles) {
			$.each(hoteles ['docs'], function (indexInArray, hotel) { 
				filasHoteles += '<tr>';

				filasHoteles += '	<td>';
				filasHoteles += '		'+hotel.NOMBRE;
				filasHoteles += '	</td>';
				
				filasHoteles += '	<td>';
				filasHoteles += '		'+hotel.DIRECCION;
				filasHoteles += '	</td>';
				
				filasHoteles += '	<td>';
				filasHoteles += '		<a target="_blank" href="https://maps.google.com/?q='+hotel["geometry"]["coordinates"][1]+','+hotel["geometry"]["coordinates"][0]+'" class="btn btn-info">Ver ubicación</a>';
				filasHoteles += '	</td>';

				filasHoteles += '</tr>';	
			});
			$("#filasHoteles").html(filasHoteles);
		}		
	});
}