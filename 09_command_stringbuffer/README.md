# Bearbeiten des StringBuffer-Inhalts gemäß Command-Entwurfsmuster

StringBuffer bietet Möglichkeiten zum Anhängen, Einfügen und Entfernen von Text durch Methoden wie append, insert bzw. delete. Die drei gelisteten Operationen sollen jeweils als eigene Command-Implementierung realisiert werden. Die Kommandos sollen sowohl normal ausgeführt werden (execute) können, als auch rückgängig gemacht werden (undo) können.
Ein zu erstellender Testtreiber soll einen StringBuffer erzeugen, eine kleine Anzahl von konkreten Kommandos erzeugen (bestimmten Text an bestimmter Position einfügen, einen Teil des Textes entfernen, an einer bestimmten Position Text einfügen) und jedes davon auf den StringBuffer anwenden (execute). Mindestens eines der Kommandos soll unmittelbar nach seiner Ausführung rückgängig gemacht werden (undo), sodass die vorgenommene Änderung ungeschehen gemacht wird.

Für die Möglichkeit zum Zurücknehmen von Änderungen muss das Kommando Aufzeichnungen bei sich speichern, die den Effekt des Kommandos umkehren können. Beim Entfernen wäre das zum Beispiel das Merken des entfernten Textes und der Stelle, an der ausgeschnitten wurde.
