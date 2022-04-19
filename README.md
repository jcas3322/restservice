
Base De Datos MySQL
Nombre de la Base de Datos: tiendas
Puerto HTTP 8044
Diseniaado en Spring Framework
EndPoints
BaseURL = http://localhost:8044

PARA LA ENTIDAD ARTICULOS
--------------------------------------------------------------------

Peticiones GET
Obtener todos los registros = /articulos/all
Obtener MaxId para siguiente registro = /articulos/maxid
Buscar Articulo por C\'f3digo = /articulos/buscarCodigo/{codigo}
Buscar por Nombre (Like As) = /articulos/buscarPor/{nombre}

Peticiones POST
Agregar Art\'edculos = /articulos/agregar

Peticiones PUT
Modificar (Enviar entidad completa) = articulos/actualizar/{id}

Peticiones DELETE
Borrar por Id = /articulos/borrar/{id}
Borrar todo = /articulos/borrartodo (No implementado en el FrontEnd, manejo manual)

PARA LA ENTIDAD ARTICULOS 
--------------------------------------------------------------------

Peticiones GET
Obtener todos los registros = /articulosIngresados/all
Obtener por fecha = /articulosIngresados/buscarFecha/{fecha}

Peticiones POST
Agregar Registro = /articulosIngresados/agregar

PARA LA ENTIDAD ARTICULOS VENDIDOS
-------------------------------------------------------------------

Peticiones GET
Obtener todos los registro = /ArticulosVendidos/all
Obtener por fecha = /ArticulosVendidos/buscarIdVenta/{venta}

Peticiones POST
Agregar registros = /ArticulosVendidos/agregar

PARA LA ENTIDAD REGISTRO DE VENTAS
--------------------------------------------------------------------

Peticiones GET
Obtener todos los registros = /RegistroDeVentas/all
Obtener maxId para siguientes grabados = /RegistroDeVentas/maxid
Buscar por fecha = /RegistroDeVentas/buscarFecha/{fecha}

Peticiones POST
Agregar registros = /RegistroDeVentas/agregar}