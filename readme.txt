
GUÍA DE EJECUCIÓN - PRUEBA TÉCNICA AUTOMATIZACIÓN DEMOBLAZE


------------------ 1. DESCRIPCIÓN DEL PROYECTO -----------------------

Proyecto de automatización de pruebas End-to-End (E2E) para el flujo de
compra en la plataforma web Demoblaze (https://www.demoblaze.com).

Tecnologías y herramientas utilizadas:
- Lenguaje: Java 11.0.19
- Framework de automatización: Serenity BDD
- Motor BDD: Cucumber
- Patrón de diseño: Screenplay Pattern
- Gestor de dependencias y construcción: Gradle
- Navegador base: Google Chrome (ChromeDriver administrado por Serenity)


------------------ 2. REQUISITOS PREVIOS DEL ENTORNO -----------------

Antes de clonar y ejecutar el proyecto, asegúrese de contar con:
- Java JDK 11 (versión 11.0.x LTS) configurado en las variables de entorno (JAVA_HOME y PATH).
- Google Chrome instalado y actualizado en el sistema operativo.
- Conexión a Internet activa para la descarga de dependencias de Gradle.


------------------ 3. ESTRUCTURA DEL PROYECTO (SCREENPLAY) -----------

El proyecto sigue el estándar de diseño Screenplay para garantizar alta
mantenibilidad, legibilidad y desacoplamiento de componentes:

src/test/java/com/demoblaze/
  ├── runners/          
  ├── stepdefinitions/  
  ├── tasks/            
  ├── userinterfaces/   
  ├── models/           
  └── questions/        

src/test/resources/
  ├── features/        
  └── serenity.conf     


------------------ 4. INSTRUCCIONES DE EJECUCIÓN PASO A PASO ---------

Ejecución mediante Terminal / Línea de Comandos (Recomendada)
1. Abrir una terminal (cmd o PowerShell en Windows, bash en macOS/Linux).
2. Clonar el repositorio y posicionarse dentro de la carpeta del proyecto:
     cd demoblaze-automation
3. Ejecutar las pruebas y generar la agregación de reportes:
   - En Windows (PowerShell/CMD):
     .\gradlew.bat test aggregate
   - En Linux / macOS:
     chmod +x gradlew
     ./gradlew test aggregate

Opción Alternativa: Ejecución desde Visual Studio Code o IntelliJ IDEA
1. Abrir la carpeta del proyecto en el IDE.
2. Esperar a que Gradle sincronice las dependencias del proyecto.
3. Navegar hasta la clase:
     src/test/java/com/demoblaze/runners/PurchaseRunner.java
4. Hacer clic derecho sobre la clase y seleccionar "Run 'PurchaseRunner'"
   o hacer clic en el ícono verde de Play (Ejecutar prueba).
5.1 Para generar el reporte visual consolidado en HTML tras la corrida,
   ejecutar en la terminal: .\gradlew.bat aggregate (o ejecutar la tarea
   "aggregate" desde el panel de tareas de Gradle del IDE).
5.2  Para generar el reporte visual consolidado en HTML tras la corrida,
   podemos ir al menu izquierdo donde esta el icono del elefante Gradle y
   en la ruta  "Tasks/serenity bdd/aggregate" le damos clic en el botón de Play


----------5. CONSULTA DEL REPORTE DE EVIDENCIAS (SERENITY BDD) ----------

Una vez finalizada la ejecución, Serenity compila el informe interactivo
con las capturas de pantalla y el estado de cada paso en la ruta:

  demoblaze-automation/build/reports/serenity/index.html

Para visualizarlo:
- Abrir dicho archivo 'index.html' en cualquier navegador web (Chrome, Edge, etc.).
