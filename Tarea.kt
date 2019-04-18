/* Sistemas de Control de Versiones Locales

Los sistemas de control de versiones locales en vez de mantener las versiones como archivos independientes, los almacenaban en una base de datos. Cuando era necesario revisar una versión anterior del proyecto se usaba el sistema de control de versiones en vez de acceder directamente al archivo, de esta manera en cualquier momento solo se tenia una copia del proyecto, eliminando la posibilidad de confundir o eliminar versiones.

En este punto el control de versiones se llevaba a cabo en el computador de cada uno de los desarrolladores y no existía una manera eficiente de compartir el código entre ellos.
Sistemas de Control de Versiones Centralizados

Para facilitar la colaboración de múltiples desarrolladores en un solo proyecto los sistemas de control de versiones evolucionaron: en vez de almacenar los cambios y versiones en el disco duro de los desarrolladores, estos se almacenaban en un servidor.

Sin embargo, aunque el avance frente a los sistemas de control de versiones locales fue enorme, los sistemas centralizados trajeron consigo nuevos retos: ¿Cómo trabajaban múltiples usuarios en un mismo archivo al mismo tiempo?

Los sistemas de control de versiones centralizados abordaron este problema impidiendo que los usuarios invalidaran el trabajo de los demás. Si dos personas editaban el mismo archivo y se presentaba un conflicto alguien debía solucionar este problema de manera manual y el desarrollo no podía continuar hasta que todos los conflictos fueran resueltos y puestos a disposición del resto del equipo.

Esta solución funcionó en proyectos que tenían relativamente pocas actualizaciones y por ende pocos conflictos pero resulto muy engorroso para proyectos con docenas de contribuyentes activos que realizaban actualizaciones a diario.
Sistemas de Control de Versiones Distribuidos

La siguiente generación de sistemas de control de versiones se alejo de la idea de un solo repositorio centralizado y optó por darle a cada desarrollador una copia local de todo el proyecto, de esta manera se construyo una red distribuida de repositorios, en la que cada desarrollador podía trabajar de manera aislada pero teniendo un mecanismo de resolución de conflictos mucho más elegante que un su versión anterior.

Al no existir un repositorio central, cada desarrollador puede trabajar a su propio ritmo, almacenar los cambios a nivel local y mezclar los conflictos que se presenten solo cuando se requiera. Cómo cada usuario tiene una copia completa del proyecto el riesgo por una caída del servidor, un repositorio dañado o cualquier otro tipo de perdida de datos es mucho menor que en cualquiera de sus predecesores.
¿Cuáles son las ventajes  de utilizar el control de versiones?
Ventajas
•	Se sigue la historia de los archivos y directorios a través de copias y renombrados.
•	Las modificaciones (incluyendo cambios a varios archivos) son atómicas.
•	La creación de ramas y etiquetas es una operación más eficiente.
•	Tiene costo de complejidad constante (O(1)) y no lineal (O(n)) como en CVS.
•	Se envían sólo las diferencias en ambas direcciones (en CVS siempre se envían al servidor archivos completos).
•	Puede ser servido mediante Apache, sobre WebDAV/DeltaV. Esto permite que clientes WebDAV utilicen Subversion en forma transparente.
•	Maneja eficientemente archivos binarios (a diferencia de CVS que los trata internamente como si fueran de texto).
•	Permite selectivamente el bloqueo de archivos. Se usa en archivos binarios que, al no poder fusionarse fácilmente, conviene que no sean editados por más de una persona a la vez.
•	Cuando se usa integrado a Apache permite utilizar todas las opciones que este servidor provee a la hora de autentificar archivos (SQL, LDAP, PAM, etc.).
¿Cuáles son los controles de versiones disponibles para Android studio?
Android Studio admite diferentes sistemas de control de versión(VCS), incluyendo, GIT, CVS, Mercurial, Subversión y Google Cloud Source Repositories.
¿Cuáles son los servidores de controles de versiones mas conocidos?
•	CVS
•	SVN 
•	Git
Mercurial
Investigación de los términos
PUSH.- Esta operación toma como argumento un registro general, de segmento o una posición de memoria y la introduce (copia) al Stack.

Commit: La operación commit indica la finalización de una transacción satisfactoria. Indica al administrador de transacciones que una unidad de trabajo lógica ha concluido satisfactoriamente, que la base de datos está o debería estar nuevamente en un estado consistente.
En definitiva, se refiere a cuando una transacción ha completado su ejecución con éxito, o sea, ingresa en el estado committed.

Branch (rama): cuando se van a llevar a cabo cambios importantes que romperán la compilación, pruebas, experimentos o intentos de optimización, debe crearse una nueva rama de desarrollo, con la que no molestemos a los compañeros, esto es un branch: una copia del código o la rama de la que deriva. En esta copia haremos nuestros cambios, integraremos los arreglos que puedan haberse ido haciendo en el trunk, y, una vez terminado el desarrollo en la rama, integraremos (o no) los cambios en el trunk. También puede crearse una rama para una versión terminada, hacer mantenimiento de esta versión sobre esta rama, y continuar el desarrollo de la nueva versión en el trunk.
Delete: es una palabra en inglés que puede traducirse como «eliminar», «suprimir» o «borrar». 
 Stack: Una pila (stack en inglés) es una lista ordenada o estructura de datos que permite almacenar y recuperar datos, el modo de acceso a sus elementos es de tipo LIFO (del inglés Last In, First Out, «último en entrar, primero en salir») . Esta estructura se aplica en multitud de supuestos en el área de informática debido a su simplicidad y capacidad de dar respuesta a numerosos procesos.

Repositorio: Proporcionados por los desarrolladores de distribuciones Linux, son los usados para facilitar la instalación de software. Los repositorios, no son más que servidores centralizados donde se almacenan los paquetes (aplicaciones, librerías, controladores, documentación) con el objetivo de proporcionar un recurso directo para su instalación.
Gracias a estos, es posible emplazar un inmensa cantidad de aplicaciones a través de un mecanismo sencillo: el uso de los gestores de paquetes. Cada distribución suele tener su propia herramienta, aunque hay algunos estándares en ciertos grupos de distribuciones.
Trabajando con el CVS
Repositorio es la palabra que se usa en la terminología del CVS para referirnos a un área (directorio, servidor, etc.) en el que están ubicados nuestros proyectos, y que debe estar al alcance de las máquinas de las personas que vayan a trabajar en los proyectos que demos de alta en el repositorio, por lo que lo mejor va a ser que consigamos una máquina libre, instalemos nuestra distribución GNU/Linux preferida y pasemos a instalar el CVS en ella.

¿Qué es un fragmento?

La necesidad de usar fragmentos nace con la versión 3.0 (API 11) de Android debido a los múltiples tamaños de pantalla que estaban apareciendo en el mercado y a la capacidad de orientación de la interfaz ( Landscape y Portrait). Estas características necesitaban dotar a las aplicaciones Android de la capacidad para adaptarse y responder a la interfaz de usuario sin importar el dispositivo.
Un fragmento es una sección “modular” de interfaz de usuario embebida dentro de una actividad anfitriona, el cual permite versatilidad y optimización de diseño. Se trata de miniactividades contenidas dentro de una actividad anfitriona, manejando su propio diseño (un recurso layout propio) y ciclo de vida.

¿ Cuales son las capacidades de un fragmento en un aplicación android?
 Un Fragment representa un comportamiento o una parte de la interfaz de usuario en una Activity. Puedes combinar múltiples fragmentos en una sola actividad para crear una IU multipanel y volver a usar un fragmento en múltiples actividades. Puedes pensar en un fragmento como una sección modular de una actividad que tiene su ciclo de vida propio, recibe sus propios eventos de entrada y que puedes agregar o quitar mientras la actividad se esté ejecutando (algo así como una "subactividad" que puedes volver a usar en diferentes actividades).

Un fragmento siempre debe estar integrado a una actividad y el ciclo de vida del fragmento se ve directamente afectado por el ciclo de vida de la actividad anfitriona. Por ejemplo, cuando la actividad está pausada, también lo están todos sus fragmentos, y cuando la actividad se destruye, lo mismo ocurre con todos los fragmentos. Sin embargo, mientras una actividad se está ejecutando (está en el estado del ciclo de vida reanudada ), puedes manipular cada fragmento de forma independiente; por ejemplo, para agregarlos o quitarlos. Cuando realizas una transacción de fragmentos como esta, también puedes agregarlos a una pila de actividades administrada por la actividad; cada entrada de la pila de actividades en la actividad es un registro de la transacción de fragmentos realizada. La pila de actividades le permite al usuario invertir una transacción de fragmentos (navegar hacia atrás) al presionar el botón Atrás.
Estas nuevas entidades permiten reusar código y ahorrar tiempo de diseño a la hora de desarrollar una aplicación. Los fragmentos facilitan el despliegue de tus aplicaciones en cualquier tipo de tamaño de pantalla y orientación.

Otra ventaja de usarlos es que permiten crear diseños de interfaces de usuario de múltiples vistas. ¿Qué quiere decir eso?, que los fragmentos son imprescindibles para generar actividades con diseños dinámicos, como por ejemplo el uso de pestañas de navegación, expand and collapse, stacking, etc.
 
 ¿Como se pueden agragar y quitar fragmentos?
 Crear un Fragment (Fragmento)


Puedes ver a un fragment como una sección modular de una actividad, el cual tiene su propio ciclo de vida, recibe sus propios eventos de entrada, y que puedes añadir o eliminar mientras la actividad se está ejecutando (algo así como una “sub-actividad” que puedes reutilizar dentro de diferentes actividades). Esta lección te muestra cómo extender la clase  Fragment utilizando la Support Library para que tus versiones se mantengan compatibles con dispositivos que ejecuten versiones superiores a Android 1.6.

    Nota: Si decides que el API mínimo de tu app requiere 11 o más, no necesitas utilizar la Support Library y puedes en su lugar utilizar la clase  Fragment y las APIs relacionadas que se encuentra en la estructura de la plataforma por defecto para dichas versiones. Ten en cuenta que esta lección se enfoca en las APIs de la Support Library, las cuales utilizan una firma de paquete específica y algunas veces nombres de la API ligeramente diferentes que las versiones incluidas por defecto en la plataforma.

crear un fragment



Crear una Clase Fragment

Para crear un fragmento, extiende la clase  Fragment, y sobreescribe los métodos del ciclo de vida claves para insertar la lógica de tu app, de forma similar a como lo harías con la clase  Activity.

La diferencia es que al crear un  Fragment tu debes utilizar la llamada onCreateView() para definir el layout. De hecho, esta es la única llamada que necesitas para conseguir que se ejecute el fragmento. Por ejemplo, aquí puedes ver un fragmento simple que especifica su propio layout:
ArticleFragment.java
Java

	
 
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
 
public class ArticleFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
        Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.article_view, container, false);
    }
}
 

Como si se tratase de una actividad, un fragmento debería implementar los métodos del ciclo de vida que te permiten gestionar su estado en función de si es añadido o eliminado de la actividad en la que se encuentre, además de las transiciones de la actividad entre los diferentes estados del ciclo de vida. Por ejemplo, cuando el método  onPause() de la actividad es llamado, cualquier fragmento en la actividad también llama a  onPause().
Advertisements

Para más información sobre el ciclo de vida de un fragmento y los métodos, visita la guía del desarrollador sobre  Fragments.
Añadir un Fragment a una Actividad utilizando XML

Mientras que los fragmentos son reutilizables, componentes de la UI modulares, cada instancia de una clase  Fragment debe asociarse con un padre  FraggmentActivity. Puedes hacer esta asociación definiendo cada fragmento dentro del archivo XML que es el layout de tu actividad.

    Nota:  FragmentActivity es una actividad especial proporcionada en la Support Library para manipular los fragmentos en versiones del sistema inferiores a un nivel API 11. Si no utilizas la Support Library puedes utilizar una  Activity normal.

Aquí puedes ver un ejemplo de un archivo layout que incluye dos fragmentos para que en una actividad que se utilice en una pantalla considerada “grande (large)” (especificada mediante el calificador  large en el nombre del directorio).
res/layout-large/news_articles.xml
XHTML


	
 
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:orientation="horizontal"
    android:layout_width="fill_parent"
    android:layout_height="fill_parent">
 
    <fragment android:name="com.example.android.fragments.HeadlinesFragment"
              android:id="@+id/headlines_fragment"
              android:layout_weight="1"
              android:layout_width="0dp"
              android:layout_height="match_parent" />
 
    <fragment android:name="com.example.android.fragments.ArticleFragment"
              android:id="@+id/article_fragment"
              android:layout_weight="2"
              android:layout_width="0dp"
              android:layout_height="match_parent" />
 
</LinearLayout>
 

    Consejo: Para más información sobre crear layouts para diferentes tamaños de pantalla, visita Soporte de Diferentes Tamaños de Pantalla.

Ahora aplica el layout a tu actividad:
MainActivity.java
Java

 
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
 
public class MainActivity extends FragmentActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.news_articles);
    }
}
 

Si estás utilizando la v7 appcompat library, tu actividad debería en su lugar extender  AppCompatActivity, la cual es una subclase de  FragmentActivity (para más información, visita Añadir la Action Bar).

Nota: Cuando añades un fragmento a un layout de una actividad definiendo el fragmento en el archivo XML del layout, no puedes eliminar el fragmento en tiempo de ejecución. Si planeas intercambiar entre tus fragmentos durante la interacción del usuario, debes añadir el fragmento a la actividad cuando esta se inicia por primera vez, como se muestra en la próxima lección.


¿Como funciona la interación entre fragmentos?
Para reutilizar los componentes de la Interfaz de Usuario del Fragment, deberías crear cada uno como un contenedor de ellos mismos, componentes modulares que definen su propio layout y comportamiento. Una vez que has definido dichos fragmentos reutilizables, puedes asociarlos con una actividad y conectarlos con la lógica de la aplicación

A menudo querrás que uno fragmento se comunique con otro, por ejemplo para cambiar el contenido, basándose en un petición del usuario. Todas las comunicaciones Fragmento a Fragmento se hacen a través de la actividad asociada. Dos fragmentos no deberían comunicarse nunca directamente.

Contenidos

Definir un Interfaz
Implementar el Interfaz
Enviar un Mensaje al Fragment
¿Es importante el uso de fragmentos en la programacón movil?
Fragment en Android
Los fragmentos no son obligatorios en las aplicaciones, pero podemos utilizarlos para aumentar la interacción en una misma pantalla. Un Activity o actividad, puede estar formado de muchos fragmentos, por lo que podríamos definirlos como componentes de una Activity.


 
De los fragmentos, destaco lo siguiente:

Puedes declarar varios fragmentos en una misma Activity.
Si destruyes/pausas/ una actividad, destruyes/pausas sus fragmentos.
Existen desde la API 11.

 */
