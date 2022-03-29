# Verhaltensmuster

- [Chain of Responsibility](#chain-of-responsibility)
- [Command](#command)
- [Observer](#observer)
- [State](#state)
- [Strategy](#strategy)

## Chain of Responsibility

- Reduziert die Kopplung zwischen dem Sender einer Nachricht und dem/den Empfänger(n)
- Interessierte Empfänger werden in einer Liste verwaltet (`LinkedList`)
- Die Empfänger erhalten die Nachricht der Reihe nach bis ein Empfänger sie behandelt. Dahinter gelistete Empfänger werden daraufhin ignoriert.
- Beispiel: Ereignisbehandlung  in GUI

![UML Diagramm](https://upload.wikimedia.org/wikipedia/commons/thumb/4/40/Zustaendigkeitskette.svg/472px-Zustaendigkeitskette.svg.png)

## Command

- Abläufe werden in Objekten zusammengefasst
- Festgelegte Abläufe können in Sammlungen (Stack) zusammengefasst und verwaltet werden.
- Beispiel: Undo-Funktionalität

![UML Diagramm](https://www.philipphauer.de/study/se/design-pattern/command/command-beschreibung.svg)

## Observer

- Bei Zustandsänderung eines Objektes werden alle davon abhängigen Objekte automatisch informiert
- Verwendung einer Liste: `LinkedList`
- Vorteile:
	- Eine Abstraktion zwei Aspekte hat, wobei einer vom anderen abhängt => Wiederverwendung
	- Eine Änderung in einem Objekt zu Folgen in möglicherweise vielen anderen Objekten führen soll, ohne die tatsächliche Anzahl genau zu kennen.
	- Ein Objekt in der Lage sein soll, andere Objekte zu benachrichtigen, ohne diese genauer zu kennen und an diese eng gekoppelt zu sein.

![UML Diagramm](https://www.philipphauer.de/study/se/design-pattern/observer/observer-def.svg)

## State

- Ermöglicht einem Objekt, sein Verhalten während der Laufzeit zu verändern
- Änderung des internen Zustandes
- Beispiel: TCP-Verbindungen (aufgebaut, horchend, geschlossen)
- Allen Zuständen haben ine gemeinsame Schnittstelle. Die verschiedenen konkreten State-Klassen implementieren dieses Interface dem jeweiligen Zustand entsprechend.

![UML Diagramm](https://www.philipphauer.de/study/se/design-pattern/state/beschreibung.svg)

## Strategy

- Kapselung von verschiedenen Algorithmen einer Familie
- Verwendung:
	- viele verschiedene Klassen sich nur in ihrem Verhalten unterscheiden
	- verschiedene Varianten eines Algorithmus benötigt werden
	- ein Algorithmus viele bzw. komplexe Daten benötigt, die vor dem Client verborgen werden sollen
	- eine (Kontext-)Klasse viele verschiedene Verhalten definiert und dafür viele bedingte Anweisungen (Verzweigungen) verwendet werden
- Beispiel: Suchverfahren
- Ein Interface für alle unterstützten Algorithmen

![UML Diagramm](https://www.philipphauer.de/study/se/design-pattern/strategy/strategy.svg)