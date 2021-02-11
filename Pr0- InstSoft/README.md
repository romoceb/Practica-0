<h3 align="center">Aplicaciones Telemáticas</h3>

<img src="./figuras/UPVcolor300.png" align="left" height="75">

<img src="./figuras/ETSIT_UPV.png"       align="right" height="75">




<h1 align="center"><b>Instalación de software</b></h1>
<h3 align="center"><b>Visual Studio Code, Git, JDK y Jupyter Notebook</b></h3>
<h2 align="center"><b></b></h2>



<h3 align="center">Grado en Ingeniería de Tecnologías y Servicios de Telecomunicación</h3>
<h3 align="center">ETSIT-UPV</h3>



# 1. Introducción y objetivos
A continuación se darán unas directrices para poner a punto los equipos de trabajo (equipos personales o en su defecto, equipos de laboratorio) tanto para realizar un seguimiento cómodo de los contenidos de la asignatura, como  para abordar parte de las prácticas asociadas.

Vamos a proceder a instalar o verificar que ya tenemos instalado el siguiente software:

- Visual Studio Code
- Git 
- JDK
- Jupyter Notebook



# 2. Instalación de software







## 2.1. Instalación de Visual Studio Code

**Importante**: no debería confundirse `Visual Studio Code` que es el editor de textos de la firma Microsoft en el que estamos interesados con `Visual Studio` que es un IDE también de Microsoft.

Del mismo modo que con el software anterior, visítese [Visual Studio Code](https://code.visualstudio.com/) y descárguese la versión del instalador acorde con la arquitectura de la máquina (Windows, Linux y MacOS) y procédase con su instalación aceptando todas las opciones que trae por defecto.

Tras la descarga e instalación, una primera ejecución de prueba y cierre posterior, compruébese que también es accesible vía comandos como `code`. Para ello, arránquese una ventana de línea de comandos o CLI -Command Line Interface- (en el buscador de la barra de tareas de Windows, búsquese el término `CMD` o `PowerShell`; en Linux o Mac OS-X, búsquese una `terminal`) y ejecútese

- En un Linux o Mac OS-X: 
```bash
which code
```

- En `CMD`:
```bash
where code
```

- En `PowerShell`:
```bash
where.exe code
```

donde `which <comando>`, `where <comando>` o `where.exe <comando>` dan como respuesta en qué ubicación se encuentra la orden `<comando>` en cuestión. Si aparece, es muestra inequívoca de que existe y se puede utilizar. 

Si `code` es accesible, para editar un archivo desde el directorio de trabajo de la ventana de línea de comandos, simplemente habrá que escribir en dicha ventana:
```bash
code fichero.txt
```
y aparecerá la ventana gráfica con el editor, tal y como muestra la siguiente figura:


<p align="center"><br/>
<img src="figuras/editor.svg" width="800" >
</p>
<p align="center"><b>Figura 1</b>: editor <code>Visual Studio Code</code></p><br/>


Evidentemente el editor también es accesible clicando en el icono correspondiente (<img src="figuras/VSC.svg" width=15>) del menú de aplicaciones  o en el escritorio, si ahí aparece.

Si no se tiene experiencia previa con este editor, no importa, pues el interfaz es el típico de cualquier editor de textos plano. Conforme vayan necesitándose características adicionales de este software, se irán indicando.

# 2.2. Instalación de Git


A continuación enumeramos los pasos más importantes para llevar a cabo la instalación:

- Del sitio web de [Git](https://git-scm.com/), descárguese la última versión de Git acorde con la arquitectura de la máquina destino: Windows, Linux o Mac OS-X.

- Procédase con una instalación estándar en la que se acepten todas las opciones por defecto

- Configuración del nombre y email de usuario, así como de herramientas de edición de diferencias: ábrase una ventana de línea de comandos (`Git Bash` -incluido en la propia instalación de Git- o `CMD` o `PowerShell`, en Windows, o un terminal en Linux/MacOSX) y ejecútese lo siguiente
```bash
git config --global user.name <IDENTIFICATIVO_PERSONAL>
git config --global user.email <EMAIL>
git config --global core.editor "code --wait"
git config --global diff.tool vscode
git config --global difftool.vscode.cmd "code --wait --diff $LOCAL $REMOTE"
```

Con las configuraciones indicadas, se utilizará `Visual Studio Code` como herramienta para llevar a cabo fusiones manuales y detección de diferencias entre versiones.

Con esto, tendremos mínima y correctamente configurado el entorno para el control de versiones con Git.  Con ello, ya podremos clonar el presente repositorio en local con la ejecución de la siguiente instrucción en cualquier CLI:

```bash
git clone https://github.com/AATT-ETSIT-20-21/Inst-Soft-<NOMBRE_ALUMNO> <RAIZ_REPO_LOCAL>
```
tras lo cual, la estructura de ficheros que obtendremos será como la que se muestra a continuación:

```
<RAIZ_REPO_LOCAL>
  ├── JupyterNBJavaTest.ipynb
  ├── README.md
  ├── figuras
  │   └── ...
  └── java
      └── Prueba.class
```

siendo `https://github.com/AATT-ETSIT-20-21/Inst-Soft-<NOMBRE_ALUMNO>` la URL del repositorio que aparece en el navegador y `<RAIZ_REPO_LOCAL>` el directorio donde se desea que se guarde toda esta información (si no existe dicho directorio, se creará en la clonación).



Adicionalmente, tras la instalación de Git, en las máquinas Windows tendremos una CLI adicional: junto con `CMD` y  `PowerShell` podremos arrancar una CLI denominado `Git Bash`, siendo equivalente a un terminal ejecutado en un entorno Linux o Mac OS-X con *shell* `Bash`. Para arrancarlo podemos utilizar el botón derecho del raton sobre una ventana seleccionando entonces `Git Bash Here`.







# 2.3 Instalación de Java 

Se sugiere que se instale o en su defecto se actualice la versión del JDK de Java a la última disponible. Si se instalara o se dispusiera de una versión inferior a la 9, muy probablemente los Jupyter Notebooks que se emplearán posteriormente, no funcionarán.

Para ello, visítese [Java Standard Edition Downloads](https://www.oracle.com/es/java/technologies/javase-downloads.html) de Oracle y escójase la última versión (Java SE 15, en el momento de la redacción del presente documento), clicando en el enlace relativo a `JDK Download`. Aparecerá una lista con las distintas plataformas: en el caso de Windows, se sugiere la opción `Windows x64 Installer`, en el caso de MacOS, `MacOS Installer`, y en el caso de Linux, dependerá de la distribución que se emplee.

Una vez descargado el fichero en cuestión, hay que seguir las indicaciones del instalador aceptando las opciones que da por defecto. Una vez finalizada la instalación conviene, en principio de forma exclusiva en la plataforma Windows, ajustar la variable de entorno `Path`; para el resto de plataformas, este ajuste se hace de manera implícita con la instalación.

Para ello, ábrase el editor de variables de entorno o sistema, por ejemplo escribiendo en el buscador de la barra de tareas la palabra clave `variables`:

<p align="center"><br/>
<img src="figuras/variables.svg" width="800" >
</p>
<p align="center"><b>Figura 2</b>: buscando el editor de variables de entorno</p><br/>

Clíquese en la *Mejor coincidencia* <code>Editar las <b>variables</b> de entorno...</code> tal y como aparece en la figura 2. A continuación se observará la siguiente ventana titulada `Propiedades del sistema`:

<p align="center"><br/>
<img src="figuras/propiedades.svg" width="800" >
</p>
<p align="center"><b>Figura 3</b>: ventana con propiedades del sistema</p><br/>


Al clicar en el botón de `Variables de entorno` tendremos la posibilidad de modificarlas. La intención es *añadir* a la variable de entorno  `Path` (del sistema, en vez del usuario en el que se está actualmente, para que valga para cualquier usuario) el directorio donde se encuentran los ejecutables relativos al JDK: `javac`, `java`, `javadoc`, `javap`, `jar`... para que el sistema operativo pueda encontrar dichos ejecutables en un entorno de línea de comandos.

Previendo que en un futuro se vuelva a actualizar el JDK, modificaremos la variable de entorno `Path` empleando una variable intermedia *nueva*, la cual denominaremos `JAVA_HOME` y que contendrá el directorio base de la versión de Java en la que estamos interesados.

<p align="center"><br/>
<img src="figuras/nuevaVariable.svg" width="800" >
</p>
<p align="center"><b>Figura 4</b>: creación de una nueva variable de entorno del sistema</p><br/>




<p align="center"><br/>
<img src="figuras/nuevaVariableSistemaNombre.svg" width="800" >
</p>
<p align="center"><b>Figura 5</b>: nombre de la nueva variable a crear</p><br/>



A continuación tenemos que  conocer cuál es el valor que le vamos a proporcionar a `JAVA_HOME`; si no lo conocemos, podemos buscar dentro de `C:\Archivos de programa\Java` un directorio que represente el JDK que acabamos de bajar

<p align="center"><br/>
<img src="figuras/pathJDK.svg" width="800" >
</p>
<p align="center"><b>Figura 6</b>: path del JDK que acabamos de bajar</p><br/>


El *path* que debemos copiar lo podemos obtener clicando en la carpeta interesada (`jdk-15.0.1` en el ejemplo) y tras ello, clicar en la barra de direcciones de la ventana, apareciendo la representación alternativa resaltada (de ahí ya podemos llevarla al portapapeles de manera convencional )


<p align="center"><br/>
<img src="figuras/pathACopiar.svg" width="800" >
</p>
<p align="center"><b>Figura 7</b>: path a copiar</p><br/>

Este es entonces el valor que debemos asignarle a la nueva variable de sistema `JAVA_HOME`:


<p align="center"><br/>
<img src="figuras/nuevaVariableSistemaRellenada.svg" width="800" >
</p>
<p align="center"><b>Figura 8</b>: nueva variable de entorno completamente definida</p><br/>

Tras aceptar, ya tenemos la nueva variable de entorno del sistema creada. Ahora, el *path* representado por la concatenación de  `%JAVA_HOME%` y el subdirectorio `\bin`, es decir `%JAVA_HOME%\bin`,   debe ser  añadido a `Path`y de esa manera, si queremos cambiar de JDK simplemente tendremos que actualizar la variable `JAVA_HOME`. Esta forma de llevar a cabo la actualización de `Path` es tan solo una posibilidad y no es más que una sugerencia.

A continuación, seleccionamos la variable del sistema `Path` y clicamos en editar, tal y como muestra la siguiente
figura


<p align="center"><br/>
<img src="figuras/editarPath.svg" width="800" >
</p>
<p align="center"><b>Figura 9</b>: editar la variable de entorno <code>Path</code></p><br/>




Añadimos la cadena `%JAVA_HOME%\bin`:



<p align="center"><br/>
<img src="figuras/JAVA_HOME_anadido.svg" width="800" >
</p>
<p align="center"><b>Figura 10</b>: <code>%JAVA_HOME%\bin</code> añadido a variable <code>Path</code></p><br/>



Con el valor seleccionado, clíquese `Subir` hasta que aparezca en la primera posición de la lista (de esta manera tendrá mayor precedencia sobre cualquier otra opción posterior):


<p align="center"><br/>
<img src="figuras/primeraPosicion.svg" width="800" >
</p>
<p align="center"><b>Figura 11</b>: primera posición para <code>%JAVA_HOME%\bin</code></p><br/>


Una vez realizado todo este proceso, se clica `Aceptar` de esta ventana de Edición de variables de entorno, también se clica `Aceptar`en la ventana de Variables de entorno y por último, también se clica Aceptar en la ventana de Propiedades del sistema. Con ello ya habremos actualizado correcta y totalmente Java en un sistema Windows. 

Estos pasos, dependiendo de la distribución, normalmente no son necesarios en los sitemas Linux ya que se realizan automáticamente; tampoco en MacOS. Si fuera necesario, la intención es la misma: identificar el directorio base de la versión de Java instalada y asignar el subdirectorio `bin` de la misma, a la variable de entorno `PATH`.

### 2.3.1. Primera verificación

A continuación, verifíquese que todo ha funcionado correctamente arrancando una ventana de línea de comandos como por ejemplo `Git Bash`, o `CMD` o `PowerShell`, escribiendo el comando `which javac` (en Git Bash o terminal de Linux/MacOSX), o bien `where javac` o `where.exe javac`  en `CMD` o `PowerShell`respectivamente, tal y como se realizó anteriormente con `code`. 

Adicionalmente, también puede ejecutarse ya, escribiendo el comando `javac -version`:

<p align="center"><br/>
<img src="figuras/javacversion.svg" width="800" >
</p>
<p align="center"><b>Figura 12</b>: verificación de instalación en <code>CMD</code> de Windows</p><br/>

O bien en una ventana de PowerShell, ejecútese el mismo comando:

<p align="center"><br/>
<img src="figuras/javacversionps.svg" width="800" >
</p>
<p align="center"><b>Figura 13</b>: verificación de instalación en <code>PowerShell</code></p><br/>

O bien en un `Git Bash`, también de Windows:

<p align="center"><br/>
<img src="figuras/javacversionbash.svg" width="800" >
</p>
<p align="center"><b>Figura 14</b>: verificación de instalación en <code>Git Bash</code></p><br/>

en alguna de las ventanas de línea de comandos mostradas. De esta manera ya tendremos definitivamente instalado y comprobado el JDK de Java en nuestra máquina.

### 2.3.2. Verificación compilando y ejecutando un ejemplo

Para verificar que todo está instalado correctamente de manera definitiva, créese con `Visual Studio Code` el fichero `java/Test.java`, es decir, el fichero `Test.java` bajo  la  carpeta `java`.  Es **MUY IMPORTANTE** que la ubicación del nuevo fichero creado sea la correcta. Hay mútiples formas de hacerlo adecuadamente. A continuación se sugiere algunas de ellas:
- Ábrase `Visual Studio Code`:
  - Bien desde el menú de aplicaciones del sistema operativo
  - Bien desde una ventana de línea de comandos con el comando `code` 
  - Bien clicando sobre el icono del mismo, si lo tuviéramos en el escritorio o en alguna barra de menú.
  Recuérdese en cualquier caso que el logo del editor es el siguiente: <img src="figuras/VSC.svg" width=20>

Una vez abierto, en el menú `File`, `Archivo` o `Fichero`, accédase a abrir **no un fichero**, sino **la carpeta** donde queremos que esté el futuro nuevo fichero (en nuestro caso, la carpeta `java` del directorio raíz del repositorio local actual `<RAIZ_REPO_LOCAL>`)

<p align="center"><br/>
<img src="figuras/vsc_abierto.svg" width="800" >
</p>
<p align="center"><b>Figura 14</b>: apertura de carpeta o directorio en <code>Visual Studio Code</code></p><br/>


<p align="center"><br/>
<img src="figuras/carpeta_java.svg" width="800" >
</p>
<p align="center"><b>Figura 15</b>: elección de directorio de trabajo: <code>java</code></p><br/>

Deberíamos encontrarnos ya, en la propia carpeta `java`,  con un fichero denominado `Prueba.class`. A continuación deberíamos escoger la opción de crear un `Nuevo fichero`, tal y como se indica en la siguiente figura:

<p align="center"><br/>
<img src="figuras/nuevo_fichero.svg" width="800" >
</p>
<p align="center"><b>Figura 16</b>: nuevo fichero</p><br/>

A continuación deberíamos introducir el nombre del nuevo fichero a crear, en nuestro caso `Test.java`:

<p align="center"><br/>
<img src="figuras/nombre_fichero.svg" width="800" >
</p>
<p align="center"><b>Figura 17</b>: nombre del nuevo fichero</p><br/>

Y por último, rellenar dicho fichero `java/Test.java` con el contenido siguiente:

```java
public class Test {
    public static void main(String[] args) {
        System.out.println("constante: " + Prueba.CONSTANTE);
        int DNI = XXXXXXXX;
        String valor = Prueba.funcion(DNI);
        System.out.println("funcion(" + DNI + "): " + valor);
    }
}
```

donde `Prueba.CONSTANTE` es una constante estática de la clase `Prueba`, a priori desconocida, pero fácilmente reconocible una vez escrita, y `Prueba.funcion(DNI)`, una funcion estática de la clase `Prueba` que debe tener como argumento `DNI`, el entero correspondiente al DNI del alumno (sin letra, por tanto).


<p align="center"><br/>
<img src="figuras/contenido.svg" width="800" >
</p>
<p align="center"><b>Figura 18</b>: contenido del fichero <code>java/Test.java</code></p><br/>

Tal y como comentamos anteriormente, ya existía en el directorio `java` el fichero `Prueba.class` que contiene la clase `Prueba` (es decir, el resultado de compilar un supuesto fichero denominado probablemente `Prueba.java` que no se adjunta para no conocer de antemano el contenido del mismo) utilizada en `Test.java` tal y como se podrá comprobar. Para verificar que todo funciona, compilaremos primeramente `Test.java` y luego ejecutaremos la máquina virtual ejecutando el *punto de entrada* de la clase resultante de dicha compilación. Para ello, necesitamos abrir una ventana de línea de comandos y ubicarnos en el directorio `java` relativo al directorio raíz del repositorio local (`<RAIZ_REPO_LOCAL>`), habiendo varias posibilidades para ello:
- Abrir una ventana de línea de comandos:
  - Windows: abrir un `Git Bash`, o una ventana `CMD` o `PowerShell`
  - Linux/MacOS-X: abrir un terminal

  Y después mediante comando(s) `cd` llegar hasta el directorio `java` que cuelga de `<RAIZ_REPO_LOCAL>`.
- Abrir un terminal dentro del propio `Visual Studio Code` que tenemos abierto en el que estamos editando el fichero `Test.java`.

Optaremos por esta última opción y de esta manera conoceremos una manera alternativa de trabajar en línea de comandos. El tipo de terminal (`Git Bash`, `CMD`, `PowerShell`, `bash`, `zsh`, ...) que se abrirá dentro del propio `Visual Studio Code` dependerá de cuál sea la elección por defecto, la cual es fácilmente ajustable tal y como se muestra a continuación.



<p align="center"><br/>
<img src="figuras/nuevoTerminal.svg" width="800" >
</p>
<p align="center"><b>Figura 19</b>: terminal o ventana de línea de comandos dentro de <code>Visual Studio Code</code></p><br/>


Escribamos dentro de la subventana abierta como terminal:
```bash
javac Test.java
```
verificando que no se da ningún mensaje de error:

<p align="center"><br/>
<img src="figuras/compilacion.svg" width="800" >
</p>
<p align="center"><b>Figura 20</b>: compilación de <code>Test.java</code></p><br/>


en cuyo caso, entonces procédase a la ejecución:

```bash
java Test
constante: ??????????????????
funcion(XXXXXXXX): ?????
```

<p align="center"><br/>
<img src="figuras/ejecucion.svg" width="800" >
</p>
<p align="center"><b>Figura 21</b>: ejecución de <code>Test</code></p><br/>



A partir de la ejecución, tómese nota de cuál es el valor de  `Prueba.CONSTANTE`, atributo de la clase `Prueba` y de cuál puede ser la funcion `Prueba.funcion(.)`; para esto último se proporciona la  siguiente pista:

- Es el resultado de la ejecución de una función *hash*, *digest* o *resumen* (una función *hash*, *digest* o *resumen* _reduce_ una cantidad indeterminada de bits a una cantidad fija; por ejemplo, la función *hash* SHA256 entrega, frente a los bits que le introduzcamos, independientemente de su cantidad, 256 bits a su salida). Más concretamente, `Prueba.funcion(.)`, por simplificar, solo entrega los primeros 20 bits de todos los bits del resumen (los bits devueltos son agrupados de 4 en 4 y codificados en hexadecimal como se habrá podido comprobar). 

Se proponen como funciones *hash* candidatas: MD5, SHA256 y SHA1. Inténtese deducir cuál de ellas es, intentando conseguir ejecutables de dichas funciones, bien en línea de comandos, bien en alguna aplicación web en internet, y a base de prueba y error, identificarla.

Una vez determinada la función *hash*, vuélvase a editar el propio fichero `Test.java` incluyendo al principio del mismo un comentario que incluya el nombre de la constante y el nombre de la función hash empleada.


## 2.4. Instalación para lectura de Jupyter Notebooks

Con la intención de asimilar de forma efectiva y rápida los conceptos elementales del lenguaje de programación **Java**, vamos a proporcionar algunas indicaciones para poder incluir como _kernel_ a **Java** en un _Jupyter notebook_. De esta forma, alguno o algunos temas de la asignatura parcial o totalmente, podrán ser visualizados interactuando con ellos utilizando como lenguaje **Java**. 

Para ello va a ser necesario tener una instalada una distribución de __Python__. Existen varias posibilidades para ello y por unificar la distribución a emplear, elegiremos __Anaconda__.

Adicionalmente es necesario tener instalado una versión del JDK >= 9, accesible actualizando correctamente la variable de entorno `Path` o  `PATH`, tal y como ya se ha mostrado anteriormente.




### 2.4.1. Instalación de __Anaconda__

Visítese el sitio [Anaconda](http://www.anaconda.com), en él, dentro de la sección _Products_ -> _Individual edition_, búsquese el boton `download` para descargarse el instalador necesario. Por ejemplo, para Windows, sería el _64 bit graphical installer_.

Tras su desarga, llévese a cabo una instalación convencional aceptando todas y cada una de las opciones por defecto.





### 2.4.2. Actualización e instalación de paquetes

Una vez finalizada la instalación, ejecútese __Anaconda__ (por ejemplo, en Windows, lo podremos encontrar dentro del menú Inicio, como  **Anaconda3 (64bit)** y dentro,  **Anaconda Navigator (anaconda3)**. tras lo cual aparecerá una ventana como la se muestra a continuación:



<p align="center"><br/>
<img src="figuras/JupyterInic.svg" width="800" >
</p>
<p align="center"><b>Figura 22</b>: inicio de <b>Anaconda</b></p><br/>


Antes de continuar con el entorno de Python Anaconda, vamos a descargarnos el software necesario para poder trabajar en Java con los Jupyter Notebooks. Para ello:

- Accédase a [IJava](https://github.com/SpencerPark/IJava/releases) en GitHub y descárguese la versión más reciente disponible: búsquese **Assets** al final de la descripción de la versión más reciente y selecciónese el fichero `ijava-x.y.z.zip` (`ijava-1.3.0.zip` en el momento de la escritura de este documento) asociado para proceder a su descarga.
- Descomprímase el fichero descargado, debiéndose encontrar: 
  - Un fichero denominado `install.py`
  - Una carpeta denominada `java`

  Téngase perfectamente ubicada esta carpeta. 

Ahora nos hará falta llevar a cabo cierta instalación con el software descargado, lo cual requiere que se abra un terminal con acceso al entorno Python de Anaconda, tal y como se muestra a continuación:


<p align="center"><br/>
<img src="figuras/Jupyter0.svg" width="800" >
</p>
<p align="center"><b>Figura 23</b>: arranque de terminal</p><br/>


<p align="center"><br/>
<img src="figuras/terminal.svg" width="800" >
</p>
<p align="center"><b>Figura 24</b>: terminal o consola</p><br/>


Cámbiese mediante el comando `cd` con el *path* oportuno  al directorio donde se ha realizado la descompresión del fichero `.zip` bajado (la carpeta que contiene el fichero `install.py` y la carpeta `java`), 
donde escribiremos _secuencialmente_ los siguientes comandos (esperaremos la finalización de cada uno para ejecutar el siguiente):






```bash
python install.py --sys-prefix
```

A continuación se instalará un paquete adicional que permite visualizar el Jupyter Notebook a modo de diapositivas: 

```bash
conda install -c anaconda rise
```

La instalación de `rise` hace que se muestre un botón en la interfaz web del *notebook* que permite ver el contenido del mismo en modo _diapositiva_ como si fuera una especie de _Power Point_ simplificado, por lo que no es estrictamente necesario. Si hubiera algún problema en la instalación de este último comando, ello no nos privará de poder interactuar con el *notebook*.


Por último y a modo de verificación, ejecútese de nuevo en el terminal en línea de comandos abierto:
```bash
jupyter kernelspec list
```
observando al menos una línea en la que aparece `java` como *kernel* disponible junto con su ubicación.





### 2.4.3. Arranque de Jupyter notebook

El arranque de Jupyter notebook puede hacerse directamente desde __Anaconda Navigator__, buscando el icono de __Jupyter notebook__ y clicando en el boton _Launch_:

<p align="center"><br/>
<img src="figuras/Jupyter1.svg" width="800" >
</p>
<p align="center"><b>Figura 25</b>: arranque de <b>Jupypter notebook</b></p><br/>

Y si por algún motivo, no apareciera explícitamente, podría arrancarse de forma alternativa tal y como se muestra a continuación:

<p align="center"><br/>
<img src="figuras/Jupyter2.svg" width="800" >
</p>
<p align="center"><b>Figura 26</b>: arranque alternativo de <b>Jupypter notebook</b></p><br/>

O bien, en un terminal de línea de comandos como el abierto anteriormente para la instalación de los paquetes necesarios, ejecutando en él:

```bash
jupyter notebook
```


Una vez arrancado __Jupyter notebook__, entonces observaremos que es una interfaz web con la que podremos movernos en el árbol de directorios de nuestro ordenador, seleccionando aquel _notebook_ que deseemos visualizar (los ficheros _notebook_ tienen como extensión `.ipynb`)


<p align="center"><br/>
<img src="figuras/creacionNB.svg" width="800" >
</p>
<p align="center"><b>Figura 27</b>: interfaz web de <b>Jupypter notebook: creando un notebook</b></p><br/>


La siguiente figura muestra la apariencia del _notebook_ `JupyterNBJavaTest.ipynb` que puede encontrarse en este mismo repositorio, con un kernel Java, ya abierto e interactuable. 


<p align="center"><br/>
<img src="figuras/NBFuncionando.svg" width="800" >
</p>
<p align="center"><b>Figura 28</b>: notebook abierto e interactuable</p><br/>


Se sugiere que se familiarice con el uso e interacción con el Jupyter Notebook, así como del lenguaje Markdown a partir de los mútiples tutoriales que pueden encontrarse en Internet.


### 2.4.4. Cambio de navegador

Si se desea que el navegador o *browser* en el que arranca la aplicación Jupyter Notebook sea distinto al que arranca por defecto, se pueden realizar las siguientes operaciones:

- Ábrase un terminal desde el entorno de Anaconda, como el abierto anteriormente para instalar ciertos paquetes.
- Ejecútese

  ```bash
  jupyter notebook --generate-config
  ```

  Lo cual generará el fichero `~/.jupyter/jupyter_notebook_config.py` (recuérdese que `~` denota el directorio `HOME` del usuario, por ejemplo `C:\users\USUARIO` en Windows)

- Búsquese la ruta del ejecutable del navegador deseado. En Windows, una ruta posible para Chrome puede ser:

  `C:\Program Files (x86)\Google\Chrome\Application\chrome.exe`

  y para Firefox:

  `C:\Program Files\Mozilla Firefox\firefox.exe`

- Edítese el fichero generado anteriormente (`~/.jupyter/jupyter_notebook_config.py`). Búsquese la línea donde aparece
la asignación (posiblemente comentada) a `c.NotebookApp.browser`, cambiándola por

  `c.NotebookApp.browser = u'C:/Program Files (x86)/Google/Chrome/Application/chrome.exe %s'`

  si se desea que sea Chrome el navegador a utilizar, o si por el contrario se desea Firefox:

  `c.NotebookApp.browser = u'C:/Program Files/Mozilla Firefox/firefox.exe %s'`

  **IMPORTANTE:** asegúrese de cambiar los *backslash* o `\` de la ruta del ejecutable por las barras `/` en la asignación a `c.NotebookApp.browser`. 

  Para las máquinas MacOS-X y Linux, la mecánica es similar.



### 2.4.5. Diseño de un sencillo notebook basado en Java

Diséñese un sencillo Jupyter Notebook con las siguientes indicaciones:

- Ábrase el entorno `Anaconda.Navigator`, arrancando la aplicación `Jupyter Notebook`, si no lo está ya.
- Tras abrirse una interfaz gráfica del sistema de ficheros en el navegador, navéguese hasta `<RAIZ_REPO_LOCAL>` y una vez allí, créese una nueva carpeta denominada `notebook`, tal y como muestran la figura 29 y 30.



<p align="center"><br/>
<img src="figuras/nueva_carpeta_nb.svg" width="800" >
</p>
<p align="center"><b>Figura 29</b>: creación de nueva carpeta <code>notebook</code> desde <code>&lt;RAIZ_REPO_LOCAL&gt;</code> en contexto de Juypter Notebook</p><br/>




<p align="center"><br/>
<img src="figuras/renombrar.svg" width="800" >
</p>
<p align="center"><b>Figura 30</b>: creación definitiva renombrando la nueva carpeta</p><br/>

A continuación clicaremos en la carpeta recién creada para adentrarnos en ella.
En la siguiente figura se muestra cómo crear un nuevo Jupyter Notebook empleando como *kernel* a Java.


<p align="center"><br/>
<img src="figuras/new_java.svg" width="800" >
</p>
<p align="center"><b>Figura 31</b>: creación de Jupyter Notebook con kernel de Java</p><br/>


Se abrirá entonces, una nueva pestaña en el navegador con la interfaz típica de un Jupyter Notebook:


<p align="center"><br/>
<img src="figuras/new_nb.svg" width="800" >
</p>
<p align="center"><b>Figura 32</b>: aparición de pestaña adicional con interfaz Jupyter Notebook</p><br/>


Renómbrese el notebook con un nombre distinto al de por defecto:

<p align="center"><br/>
<img src="figuras/renombrar_nb.svg" width="800" >
</p>
<p align="center"><b>Figura 33</b>: renombrado del notebook</p><br/>


Se **exige** que se cree un notebook con el siguiente aspecto y contenido típico de Java:

<p align="center"><br/>
<img src="figuras/primer_nb.svg" width="800" >
</p>
<p align="center"><b>Figura 34</b>: Jupyter Notebook</p><br/>


Estúdiese por su cuenta los detalles sintáticos del lenguaje **Markdown**.

Indáguese sobre cómo conseguir que la primera *celda* sea contenido *Markdown* y la segunda, de tipo *codigo Java* con un aspecto similar.




# 3. Verificaciones y resultados

Se sugiere encarecidamente que se realicen las siguientes acciones:

- Compruébese que:

  - Se ha generado, compilado y posteriormente ejecutado el fichero inicial `java/Test.java`

  - Se han incluido el nombre de la carpeta y de la función en `java/Test.java`

  - Se ha creado el Jupyter notebook `notebook/Mi primer notebook en Java.ipynb` con el contenido correcto

- Tras entender el funcionamiento de Git, súbase estas actualizaciones al directorio remoto GitHub del que se clonó. 


