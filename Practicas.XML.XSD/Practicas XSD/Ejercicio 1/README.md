# Practica marcadores

consiste en crear un xml que convalide con un xsd

## XSD

EL xsd es el componente fundamental para que nuestro xml funcione correctamente por lo que crearemos una etiqueta xml
```xml
<?xml version="1.0" encoding="UTF-8"?>
```
con el que podremos operar con comandos xml, siendo que tendremos que crear un **xs:schema** para conectar este con el xml y aparte este sera la etiqueta fundamental de nuestro xsd
```xsd
<xs:schema xmlns:xs="http://www.w3.org/2001/XMLSchema">
<!--  contenido  -->
</xs:schema>
```
esta contara con respectivos componentes que tendremos que darle forma para validar el xml con el xsd

1. Etiqueta element
    Esta etiqueta tendra el nombre de la etiqueta fundamental de nuestro xml
    ´´´
    <xs:element name="marcadores">
    <!--  contenido  -->
    </xs:element>
    ´´´
2. Etiqueta complex, sequence
    La etiqueta complex es una etiqueta compleja que define los datos, la sequence es una etiqueta que acompaña a la compleja, esta siendo parte fundamental para poder crear varíos datos en ella, haciendo que podamos meter otro element y otro complex con sus debidas estructuras
    ´´´xsd
    <xs:complexType>
            <xs:sequence>
                <xs:element name="pagina" maxOccurs="unbounded">
                    <xs:complexType>
                        <xs:sequence>
                            <xs:element name="nombre" type="xs:string"/>
                            <xs:element name="descripcion" type="xs:string"/>
                            <xs:element name="url" type="xs:string"/>
                        </xs:sequence>
                    </xs:complexType>
                </xs:element>
            </xs:sequence>
        </xs:complexType>
    ´´´

## xml

El xml constara por su clasica etiqueta de entrada
```xml
<?xml version="1.0" encoding="UTF-8"?>
```
Tendras que abrir la etiqueta de tu xsd principal para poder conectarte con ella
```xml
<marcadores xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:noNamespaceSchemaLocation="marcadores.xsd">
<!--  contenido  -->
</marcadores>
```
una vez establecido el vinculo tendras que poner el correspondiente contenido
1. Etiqueta pagina
    esta etiqueta es la segunda etiqueta princincipal del xml ya que esta se encargara de tener el resto de etiquetas y aparte sera esta etiqueta la que sera como una especie de entidad
    ´´´
    <pagina>
    <!--  contenido  -->
    </pagina>
    ´´´
2. Etiquetas nombre, descripcion y url
    Estas etiquetas seran las que compondran la etiqueta pagina siendo estos las etiquetas que daran nombre a cada etiqueta pagina.
    ´´´xml
    <nombre>W3C</nombre>
    <descripcion>World Wide Web Consortium.</descripcion>
    <url>http://www.w3.org/</url>
    ´´´