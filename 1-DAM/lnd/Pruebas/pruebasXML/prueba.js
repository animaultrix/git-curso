function mostrarCatalogoCDCards() {

    $.ajax({
        type: "GET",
        url: "./xml/catalogoCD.xml",
        dataType: "xml",

        error: function (e) {
            alert("Ha ocurrido un error al intentar cargar el fichero XML");
            console.log("Fallo XML: ", e);
        },

        success: function (response) {
            $("#catalogo-cds").html('');

			var _contenido = "";
			_contenido += '<div class="container">';
			_contenido += '<div class="row">';

            $(response).find("CD").each(function () {
                var _titulo = 'Título: ' + $(this).find('TITLE').text();
                console.log(_titulo);
                
                var _precio = 'Precio: ' + $(this).find('PRICE').text();
                var _artista = 'Artista: ' + $(this).find('ARTIST').text();
                var _year = 'Año: ' + $(this).find('YEAR').text();
                var _image = $(this).find('CD-IMAGE').text();
				
				//var _country = $(this).find('ARTIST').attr('COUNTRY');
				var _country = $(this).find('COUNTRY').text();
				
				_contenido += '<div class="col-md-3">';
				_contenido += '<div class="card bg-light border-warning mb-3">';
				_contenido += '	<div class="card-header text-secondary font-weight-bold"><i class="fas fa-compact-disc"></i> '+_artista+'</div>';
				_contenido += '	<div class="card-body">';
				_contenido += '		<h3 class="card-title text-center text-warning"><img src="'+_image+'" width="200"/></h3>';
				_contenido += '		<p class="card-text text-info text-justify">'+_titulo+'</p>';				
				
				if (_country != undefined) {
					_contenido += '		<p class="card-text text-info text-justify">País: '+_country+'</p>';
				}
				_contenido += '		<p class="card-text text-info text-justify">'+_year+' </p>';
				_contenido += '		<p class="card-text text-info text-justify">'+_precio+' €</p>';
				_contenido += '		<p class="card-text text-danger text-center">';
				_contenido += '			<a href="add.html" class="btn btn-success"><i class="fas fa-shopping-cart"></i> Comprar</a>';
				_contenido += '		</p>';					
				_contenido += '	</div>';
				_contenido += '</div>';
				_contenido += '</div>';
								
            });
			_contenido += '</div>';
			_contenido += '</div>';
			$("#catalogo-cds").html(_contenido);
        }
    });
}
function mostrarPlantasCards (){
	$.ajax({
		type: "GET",
		url: "./xml/plantas.xml",
		dataType: "xml",

		error: function (e) {
            alert("Ha ocurrido un error al intentar cargar el fichero XML");
            console.log("Fallo XML: ", e);
        },

		success: function (response) {
			$("#plantasID").html('');
			
			var _contenido = "";

			_contenido += '<div class="container">';
			_contenido += '		<div class="row">';			
			$(response).find("PLANT").each(function(){
				var _nombreC = 'Nombre Común: ' + $(this).find('COMMON').text();
				var _nombre = 'Nombre: ' + $(this).find('BOTANICAL').text();
				var _precio = 'Precio: ' + $(this).find('PRICE').text();
				var _disponible = 'Disponible: ' + $(this).find('AVAILABILITY').text();
				_contenido += '			<div class="col-md-4">';
				_contenido += '				<div class="card bg-light border-warning mb-3">';				
				_contenido += '					<div class="card-header text-secondary font-weight-bold"><i class="fas fa-seedling"></i> '+ _nombreC +'</div>';
				_contenido += '					<div class="card-body">';
				_contenido += '						<p class="card-text text-info text-justify">' + _nombre + '</p>';
				_contenido += '						<p class="card-text text-info text-justify">' + _precio + '</p>';
				_contenido += '						<p class="card-text text-info text-justify">' + _disponible + ' unidades</p>';
				_contenido += '						<a href="" class="btn btn-success"><em class="fas fa-shopping-cart"></em> Comprar</a>';			
				_contenido += '					</div>';
				_contenido += '				</div>';
				_contenido += '			</div>';
			});
			_contenido += '		</div>';
			_contenido += '</div>';
			$("#plantasID").html(_contenido);
		}
	});
}
function mostrarRecetasCards() {
	$.ajax({
		type: "GET",
		url: "./xml/recetas.xml",
		dataType: "xml",

		error: function (e) {
            alert("Ha ocurrido un error al intentar cargar el fichero XML");
            console.log("Fallo XML: ", e);
        },

		success: function (response) {
			$("#recetasID").html('');

			var _contenido = "";

			_contenido += '<div class="container" >';
			_contenido += '		<div class="row">';			
			$(response).find("receta").each(function(){
				var _nombre = "Receta: " + $(this).find('nombre').text();
				var _image = $(this).find('IMAGEN').text();

				_contenido += '			<div class="col-md-6 ">';
				_contenido += '				<div class="card bg-light border-warning mb-3">';
				_contenido += '					<div class="card-header text-secondary font-weight-bold"><i class="fas fa-utensils"></i> '+ _nombre +'</div>';
				_contenido += '					<div class="card-body">';
				_contenido += '						<img src="'+_image+'" width="500" "/>';
				_contenido += ' 					<h3 class="text-secondary font-weight-bold text-center">Ingredientes</h3>'
				_contenido += '						<ul class="list-group">'
				$(response).find("ingrediente").each(function(){
					var _ingrediente_nombre = $(this).attr('nombre');
					var _ingrediente_cantidad = $(this).attr('cantidad');
					
					_contenido += '							<li class="list-group-item"><div style="container""><p style="float: left; ">'+_ingrediente_nombre+'</p><p style="float: right;">'+_ingrediente_cantidad+'</p></div></li><spam style="clear:  both;"></spam>'
					
					
				});
				_contenido += '						</ul>'							
				_contenido += '					</div>';
				_contenido += '				</div>'
				_contenido += '			</div>'
			});			
			_contenido += '		</div>';
			_contenido += '</div>';
			$("#recetasID").html(_contenido);
		}
	});
	
}