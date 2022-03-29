# Strukturmuster

- [Bridge](#bridge)
- [Proxy](#proxy)
- [Adapter](#adapter)
- [Facade](#facade)
- [Decorator](#decorator)
- [Flyweight](#flyweight)
- [Composite](#composite)

## Bridge

- Entkopplung zwischen Abstraktion und Implementierung
- Client hat nur Zugriff auf das Bridge-Objekt und dieses ruft das gekapselte Objekt unmittelbar mit identen Parametern auf
- Es wird weder die Schnittstelle angepasst (Adapter) noch werden zusätzliche Operationen ausgeführt (Proxy).

![Bridge UML Diagramm](https://upload.wikimedia.org/wikipedia/commons/thumb/7/7d/Bridge-pattern.svg/1920px-Bridge-pattern.svg.png)

## Proxy

- kompatiblen Stellvertreter für ein dahinter verborgenes Objekt
- Zugriffe auf das verborgene Objekt erfolgen indirekt über den Proxy
- Vorteil:
	- ein entferntes Objekt in einem anderen Adressraum soll aufgerufen werden 
	- die aufwändige Erzeugung eines Objekts bis zur Verwendung soll verzögert werden
	- die Berechtigung vor dem Zugriff auf ein schützenswertes Objekt soll geprüft werden 

![Proxy UML Diagramm](https://de-academic.com/pictures/dewiki/112/proxy_flexibel.png)

## Adapter

- Adapter stellt ein – evtl. vorhandenes - Interface in einem anderem, davon abweichenden Interface zur Verfügung, sodass eine nahtlose Einbindung in einen inkompatiblen Client möglich wird.
- In Umgebungen mit Einfachvererbung geschieht dies durch Delegation an ein referenziertes Objekt (Adaptee) des zu integrierenden Typs. 
- Beispiel: TextView (UI-Element) kann als StringBuffer betrachteet werden.
- Vorteile:
	- zwei oder mehr inkompatible Typen interagieren 
	- bestehende inkompatible Funktionalität soll anderweitig genutzt werden 

![Adapter UML Diagramm](https://upload.wikimedia.org/wikipedia/commons/thumb/2/29/Objektadapter.svg/1920px-Objektadapter.svg.png)

## Facade

- Schafft ein vereinfachtes Interface auf eine komplexe Struktur mehrerer Objekte/Klassen
- Vereinfacht die Nutzung
- Vorteile:
	- die Komplexität eines Systems vor den Clients soll verborgen werden
	- lose Kopplung zwischen Clients und dem komplexen System soll erreicht werden

![Facade Darstellung](https://www.philipphauer.de/study/se/design-pattern/facade/variation.svg)

## Decorator

- Decorator ermöglicht – im Gegensatz zu Ableitung - die Ergänzung zusätzlicher Funktionalität zur Laufzeit 
- Nutzung von Delegation
- Dekorierer umhüllen das entsprechende Objekt, nutzen dessen Funktionalität dank kompatibler Schnittstelle und erweitern diese
- Beispiel: UI-Controls (close-/minimize/maximize-Button)

## Flyweight

- Flyweight bietet gemeinsame Nutzung (sharing) von Objekten, um eine hohe Anzahl von kleinen Objekten zu ermöglichen.

## Composite

- Bildet die Über-/Unterordnung in einem Baum von Komponenten ab
- Komponenten können Komponenten enthalten
- gemeinsame Basisklasse für Container und elementare Komponenten
- Vorteile:
	- Darstellung von Teil-Ganzes-Beziehungen
	- Gleichförmige Nutzbarkeit von Komponenten und Container für Clients

| Klassendiagramm  |  Objektdiagramm |
|---|---|
| ![Composite UML Diagramm](https://upload.wikimedia.org/wikipedia/commons/thumb/a/aa/Kompositum_Klassen.svg/1280px-Kompositum_Klassen.svg.png)  |  ![Composite Objektdiagramm](https://upload.wikimedia.org/wikipedia/commons/thumb/7/71/Kompositum_Objekte.svg/1024px-Kompositum_Objekte.svg.png) |
