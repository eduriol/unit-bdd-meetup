# Unit BDD Meetup
Ejemplo de uso de técnicas de BDD & TDD para facilitar la especificación y diseño del código de acuerdo con el comportamiento de los usuarios, siguiendo los principios definidos por John Ferguson Smart en su libro *BDD in action*, empleando Cucumber & JUnit. Este código se usó originalmente en el meetup de [En mi local funciona](http://enmilocalfunciona.io/).
## Instalación
En primer lugar necesitas tener [Maven](https://maven.apache.org/) instalado. Una vez que lo tienes, para construir el proyecto, simplemente sigue los siguientes pasos:
```
git clone https://github.com/eduriol/unit-bdd-meetup.git
cd unit-bdd-meetup
mvn package
```
La construcción habrá tenido éxito si los tests pasan.
## Ejecución
Cada vez que necesites volver a ejecutar los tests, simplemente ejecuta el siguiente comando:
```
mvn test
```
## Seguimiento del meetup
Los commits y su mensaje asociado están pensados para facilitar el seguimiento y explicación del meetup, a modo de pasos explicativos de un taller. Por ello te resultará más sencillo seguir la explicación si vas haciendo checkout de cada commit del histórico y observando la evolución del código.