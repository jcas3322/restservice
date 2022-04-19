{\rtf1\ansi\ansicpg1252\cocoartf2638
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\pard\tx566\tx1133\tx1700\tx2267\tx2834\tx3401\tx3968\tx4535\tx5102\tx5669\tx6236\tx6803\pardirnatural\partightenfactor0

\f0\fs24 \cf0 Base De Datos MySQL\
Nombre de la Base de Datos: tiendas\
Puerto HTTP 8044\
Dise\'f1ado en Spring Framework\
\
EndPoints\
BaseURL = http://localhost:8044\
\
PARA LA ENTIDAD ARTICULOS\
\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\
 \
Peticiones GET\
Obtener todos los registros = /articulos/all\
Obtener MaxId para siguiente registro = /articulos/maxid\
Buscar Articulo por C\'f3digo = /articulos/buscarCodigo/\{codigo\}\
Buscar por Nombre (Like As) = /articulos/buscarPor/\{nombre\}\
\
Peticiones POST\
Agregar Art\'edculos = /articulos/agregar\
\
Peticiones PUT\
Modificar (Enviar entidad completa) = articulos/actualizar/\{id\}\
\
Peticiones DELETE\
Borrar por Id = /articulos/borrar/\{id\}\
Borrar todo = /articulos/borrartodo (No implementado en el FrontEnd, manejo manual)\
\
PARA LA ENTIDAD ARTICULOS INGRESADOS\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\
\
Peticiones GET\
Obtener todos los registros = /articulosIngresados/all\
Obtener por fecha = /articulosIngresados/buscarFecha/\{fecha\}\
\
Peticiones POST\
Agregar Registro = /articulosIngresados/agregar\
\
PARA LA ENTIDAD ARTICULOS VENDIDOS\
\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\
\
Peticiones GET\
Obtener todos los registro = /ArticulosVendidos/all\
Obtener por fecha = /ArticulosVendidos/buscarIdVenta/\{venta\}\
\
Peticiones POST\
Agregar registros = /ArticulosVendidos/agregar\
\
PARA LA ENTIDAD REGISTRO DE VENTAS\
\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\'97\
\
Peticiones GET\
Obtener todos los registros = /RegistroDeVentas/all\
Obtener maxId para siguientes grabados = /RegistroDeVentas/maxid\
Buscar por fecha = /RegistroDeVentas/buscarFecha/\{fecha\}\
\
Peticiones POST\
Agregar registros = /RegistroDeVentas/agregar}