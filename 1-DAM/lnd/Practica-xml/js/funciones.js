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
				_contenido += '				<div class="card bg-light border-warning mb-5">';				
				_contenido += '					<div class="card-header text-secondary font-weight-bold"><i class="fas fa-seedling"></i> '+ _nombreC +'</div>';
				_contenido += '					<div class="card-body">';
				_contenido += '						<p class="card-text text-info text-justify">' + _nombre + '</p>';
				_contenido += '						<p class="card-text text-info text-justify">' + _precio + '</p>';
				_contenido += '						<p class="card-text text-info text-justify pb-3">' + _disponible + ' unidades</p>';
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
				var _dificultad = $(this).find('dificultad').text();
				var _definicion = $(this).find('definicion').text();
				var $_ingredientes = $(this).find('ingredientes');
				var $_pasos = $(this).find('pasos');
				var _calorias = $(this).find('calorias').text();
				var _tiempo = $(this).find('tiempo').text();
				var _elaboracion = $(this).find('elaboracion').text();

				_contenido += '			<div class="card bg-light border-warning mb-3 col-12">';
				_contenido += '				<div class="card-header text-secondary font-weight-bold text-center h1"><em class="fas fa-utensils"></em> '+ _nombre +'</div>';				
				_contenido += '					<div class="card-body">';			
				_contenido += '						<div class="stars rounded mx-auto d-block ">';
				
				switch (_dificultad) {
					case 'Fácil':
					_contenido +='						<label class= "star card-header my-3"  ></label>';
					_contenido +='						<label class= "star card-header my-3" ></label>';					
					_contenido +='						<label class= "star star-1 card-header my-3" ></label>';
					break;
					case 'Media':
					_contenido +='						<label class= "star card-header my-3" ></label>';
					_contenido +='						<label class= "star star-1 card-header my-3"></label>';
					_contenido +='						<label class= "star star-1 card-header my-3"></label>';
					break;
					case 'Difícil':
					_contenido +='						<label class= "star star-1 card-header my-3"></label>';
					_contenido +='						<label class= "star star-1 card-header my-3" ></label>';
					_contenido +='						<label class= "star star-1 card-header my-3" ></label>';
					break;
				}
				_contenido += '						</div>';
				_contenido +='						<div class="text-center">';
				_contenido +='							<img class="rounded" width="50%" alt = "'+_definicion+'" src="'+_image+'"/>';
				_contenido +='								<div class="row">'
                _contenido +='       							 <div class="col-6 my-5"><h3 class="card-header text-secondary font-weight-bold text-center  ">Ingredientes</h3></div>';
                _contenido +='        							 <div class="col-6 my-5"><h3 class="card-header text-secondary font-weight-bold text-center ">pasos</h3></div>';
                _contenido +='   							</div>';
				_contenido +='								<div class="row">';
				_contenido +='      							<div class="col-6">';
				_contenido += '										<ul class="list-group">';

				
				$_ingredientes.find("ingrediente").each(function(){
					var _ingrediente_nombre = $(this).attr('nombre');
					var _ingrediente_cantidad = $(this).attr('cantidad');

					_contenido +='                        					<li class="list-group-item linea">';							
					_contenido +=' 							                   <div class="row text-secondary font-weight-bold ">';
					_contenido +=' 							                      <div class="col-6">'+_ingrediente_nombre+'</div>';
					_contenido +='							                      <div class="col-6 " style="text-align: end;">'+_ingrediente_cantidad+'</div>';
					_contenido +='							                   </div>';
					_contenido +='							                </li>';

				});
				_contenido +='              						</ul>';
				_contenido +='          					  </div>';
				_contenido += '								  <div class="col-6">';
				_contenido += '									<ol class="border border-2 rounded pt-3" style="background-color: #f0f1f2;">';
	
				$_pasos.find("paso").each(function(){
					var _paso = $(this).text();
					
					_contenido +='         						  <li class="text-secondary font-weight-bold text-left">';
					_contenido +='              				      <div class="row">';
					_contenido +='                				 	     <div class="col-12 "><p class=" ">'+_paso+'</p></div>';					
					_contenido +='                 					  </div>';
					_contenido +='             					  </li>';

				});	
				_contenido += '									</ol>';
				_contenido += '								</div>';	
				_contenido += '							</div>';
				_contenido += '						<div class="container card-header my-3 h5 text-muted text-center"><p>NOTA: Para la preparación es necesario un '+_elaboracion+'. Tiempo estimado '+_tiempo+'. </br>Calorias: '+_calorias+'</p></div>';	
				_contenido += '					</div>';
				_contenido += '				</div>';
				_contenido += '			</div>';
				
			});			
			_contenido += '		</div>';
			_contenido += '</div>';
			$("#recetasID").html(_contenido);
		}
	});
	
}