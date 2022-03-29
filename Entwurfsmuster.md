# Entwurfsmuster

- abstrahierte Struktur für das Zusammenspiel von mehreren Klassen bzw. Objekten
- kein Selbstzweck - sollte nur bei bei Vorteile für Entwicklung und Wartung eingesetzt werden
- höherer Aufwand bei der Umsetzung - Nutzen erst in weiteren Entwicklungen

## Übersicht

- Erzeugungsmuster
	- Abstraktion der Erzeugung & Bereitstellung (Erzeugungsvorgang)
	- Kapselung des Rückgabetyps
	- Beispiele: Singleton, Factory Method, Abstract Factory, Prototype und Builder
- Strukturmuster
	- Beziehung zwischen Objekten & Typanpassungen, ....
	- Beispiele: Bridge, Proxy, Adapter, Facade, Decorator, Flyweight, Composite
- Verhaltensmuster
	- Kapselung von Verhalten bzw. Abläufen
	- Beispiele: Observer, Chain of Responsibility, Visitor, …


## Erzeugungsmuster

### Singelton

- Singleton stellt sicher, dass es kein zweites Objekt des selben Typs zum selben Zeitpunkt gibt und dass darauf ein zentraler Zugriff geboten wird.
- Vorteile:
	- ein System nur eine Instanz eines Typs zu einem Zeitpunkt haben darf, und diese Instanz zentral zur Verfügung gestellt wird
	- diese eine Instanz durch Ableitung erweiterbar und für Clients ohne Änderung verfügbar
- Besonderheit:
	- Initialisierung der Instanz:
		- early (sofort beim Start des Programmes => langsamer Programmstart)
		- lazy (beim ersten Aufruf der Instanz)

![Singelton UML Diagramm](https://upload.wikimedia.org/wikipedia/commons/thumb/f/fb/Singleton_UML_class_diagram.svg/250px-Singleton_UML_class_diagram.svg.png)

### Factory Method

- abstrakte Schnittstelle für die Erzeugung von Objekten
- konkrete Erzeugung in Subklassen
- Rückgabetyp: Basistyp
- Vorteile:
	- ein System die konkreten Produkterzeugung nicht vorwegnehmen will
	- die Erben den konkreten Produkttyp bestimmen lassen will
	- die Erzeugung an eine von mehreren Hilfsklassen (Abstract Factory) delegiert wird und diese Delegation an einer Stelle konzentriert werden soll

![Factory Method UML Diagramm](https://upload.wikimedia.org/wikipedia/commons/thumb/1/1e/Fabrikmethode.svg/1920px-Fabrikmethode.svg.png)

### Abstract Factory

- Bereitstellung eines Interfaces und diverser konkreter Klassen zur Erzeugung jeweils einer Familie verwandter/abhängiger Objekte
- Je Familie von Klassen muss eine entsprechende Fabrik erstellt werden
- Erzeugung einzelner Objekte dieser Familie erfolgt über eine konkrete Instanz (Singleton) der Fabrikklasse
- Vorteile:
	- ein System unabhängig von der konkreten Produkterzeugung sein soll,
	- ein System eine von mehreren Produktfamilien nutzen soll,
	- die konkrete Implementierung der Produkte geheim bleiben soll, und
	- sichergestellt werden soll, dass immer nur Produkte einer Familie gleichzeitig existieren.

![Abstract Factory UML Diagramm](https://upload.wikimedia.org/wikipedia/commons/thumb/0/02/AbstkrakteFabrik.svg/1024px-AbstkrakteFabrik.svg.png)

### Prototype

- sehr flexible Objekterzeugung
- Je unterstütztem Typ wird ein Exemplar zur Verfügung gestellt wird, um neue Objekte als Kopie dieses Exemplars zu erzeugen

![Prototyp UML Diagramm](https://upload.wikimedia.org/wikipedia/commons/thumb/5/5e/Prototyp.svg/1920px-Prototyp.svg.png)

## Strukturmuster

### Bridge

- Entkopplung zwischen Abstraktion und Implementierung
- Client hat nur Zugriff auf das Bridge-Objekt und dieses ruft das gekapselte Objekt unmittelbar mit identen Parametern auf
- Es wird weder die Schnittstelle angepasst (Adapter) noch werden zusätzliche Operationen ausgeführt (Proxy).

![Bridge UML Diagramm](https://upload.wikimedia.org/wikipedia/commons/thumb/7/7d/Bridge-pattern.svg/1920px-Bridge-pattern.svg.png)

### Proxy

- kompatiblen Stellvertreter für ein dahinter verborgenes Objekt
- Zugriffe auf das verborgene Objekt erfolgen indirekt über den Proxy
- Vorteil:
	- ein entferntes Objekt in einem anderen Adressraum aufgerufen werden soll,
	- die aufwändige Erzeugung eines Objekts bis zur Verwendung verzögert werden soll,
	- die Berechtigung vor dem Zugriff auf ein schützenswertes Objekt geprüft werden soll

![Proxy UML Diagramm](https://de-academic.com/pictures/dewiki/112/proxy_flexibel.png)

### Adapter

- Adapter stellt ein – evtl. vorhandenes - Interface in einem anderem, davon abweichenden Interface zur Verfügung, sodass eine nahtlose Einbindung in einen inkompatiblen Client möglich wird.
- In Umgebungen mit Einfachvererbung geschieht dies durch Delegation an ein referenziertes Objekt (Adaptee) des zu integrierenden Typs. 
- Beispiel: TextView (UI-Element) kann als StringBuffer betrachteet werden.
- Vorteile:
	- zwei oder mehr inkompatible Typen interagieren 
	- bestehende inkompatible Funktionalität anderweitig genutzt werden soll

![Adapter UML Diagramm](https://upload.wikimedia.org/wikipedia/commons/thumb/2/29/Objektadapter.svg/1920px-Objektadapter.svg.png)

### Facade

- Schafft ein vereinfachtes Interface auf eine komplexe Struktur mehrerer Objekte/Klassen
- Vereinfacht die Nutzung
- Vorteile:
	- die Komplexität eines Systems vor den Clients verborgen werden soll, oder
	- lose Kopplung zwischen Clients und dem komplexen System erreicht werden soll

![Facade Darstellung](https://www.philipphauer.de/study/se/design-pattern/facade/variation.svg)

### Decorator

- Decorator ermöglicht – im Gegensatz zu Ableitung - die Ergänzung zusätzlicher Funktionalität zur Laufzeit 
- Nutzung von Delegation
- Dekorierer umhüllen das entsprechende Objekt, nutzen dessen Funktionalität dank kompatibler Schnittstelle und erweitern diese
- Beispiel: UI-Controls (close-/minimize/maximize-Button)

### Flyweight

- Flyweight bietet gemeinsame Nutzung (sharing) von Objekten, um eine hohe Anzahl von kleinen Objekten zu ermöglichen.

### Composite

- Bildet die Über-/Unterordnung in einem Baum von Komponenten ab
- Komponenten können Komponenten enthalten
- gemeinsame Basisklasse für Container und elementare Komponenten
- Vorteile:
	- Darstellung von Teil-Ganzes-Beziehungen
	- Gleichförmige Nutzbarkeit von Komponenten und Container für Clients

| Klassendiagramm  |  Objektdiagramm |
|---|---|
| ![Composite UML Diagramm](https://upload.wikimedia.org/wikipedia/commons/thumb/a/aa/Kompositum_Klassen.svg/1280px-Kompositum_Klassen.svg.png)  |  ![Composite Objektdiagramm](https://upload.wikimedia.org/wikipedia/commons/thumb/7/71/Kompositum_Objekte.svg/1024px-Kompositum_Objekte.svg.png) |
