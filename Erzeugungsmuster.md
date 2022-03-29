# Erzeugungsmuster

## Singelton

- Singleton stellt sicher, dass es kein zweites Objekt des selben Typs zum selben Zeitpunkt gibt und dass darauf ein zentraler Zugriff geboten wird.
- Vorteile:
	- ein System nur eine Instanz eines Typs zu einem Zeitpunkt haben darf, und diese Instanz zentral zur Verfügung gestellt wird
	- diese eine Instanz durch Ableitung erweiterbar und für Clients ohne Änderung verfügbar
- Besonderheit:
	- Initialisierung der Instanz:
		- early (sofort beim Start des Programmes => langsamer Programmstart)
		- lazy (beim ersten Aufruf der Instanz)

![Singelton UML Diagramm](https://upload.wikimedia.org/wikipedia/commons/thumb/f/fb/Singleton_UML_class_diagram.svg/250px-Singleton_UML_class_diagram.svg.png)

## Factory Method

- abstrakte Schnittstelle für die Erzeugung von Objekten
- konkrete Erzeugung in Subklassen
- Rückgabetyp: Basistyp
- Vorteile:
	- ein System die konkreten Produkterzeugung nicht vorwegnehmen will
	- die Erben den konkreten Produkttyp bestimmen lassen will
	- die Erzeugung an eine von mehreren Hilfsklassen (Abstract Factory) delegiert wird und diese Delegation an einer Stelle konzentriert werden soll

![Factory Method UML Diagramm](https://upload.wikimedia.org/wikipedia/commons/thumb/1/1e/Fabrikmethode.svg/1920px-Fabrikmethode.svg.png)

## Abstract Factory

- Bereitstellung eines Interfaces und diverser konkreter Klassen zur Erzeugung jeweils einer Familie verwandter/abhängiger Objekte
- Je Familie von Klassen muss eine entsprechende Fabrik erstellt werden
- Erzeugung einzelner Objekte dieser Familie erfolgt über eine konkrete Instanz (Singleton) der Fabrikklasse
- Vorteile:
	- ein System unabhängig von der konkreten Produkterzeugung sein soll,
	- ein System eine von mehreren Produktfamilien nutzen soll,
	- die konkrete Implementierung der Produkte geheim bleiben soll, und
	- sichergestellt werden soll, dass immer nur Produkte einer Familie gleichzeitig existieren.

![Abstract Factory UML Diagramm](https://upload.wikimedia.org/wikipedia/commons/thumb/0/02/AbstkrakteFabrik.svg/1024px-AbstkrakteFabrik.svg.png)

## Prototype

- sehr flexible Objekterzeugung
- Je unterstütztem Typ wird ein Exemplar zur Verfügung gestellt wird, um neue Objekte als Kopie dieses Exemplars zu erzeugen

![Prototyp UML Diagramm](https://upload.wikimedia.org/wikipedia/commons/thumb/5/5e/Prototyp.svg/1920px-Prototyp.svg.png)
