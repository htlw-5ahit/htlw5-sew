# Aufwertung eines BufferedReader für die erweiterte for-Schleife (Adapter-Entwurfsmuster)

Die erweiterte for-Schleife kann Objekte, die iterierbar sind (Iterable<> implementiert), unmittelbar durchlaufen. Hierfür ist einerseits die Implementierung von Iterable<> erforderlich als auch die Bereitstellung eines Iterators<>. Die erweiterte for-Schleife nutzt die dadurch verfübare iterator-Methode des Iterable<> zum Abrufen einer Iterator-Instanz. Über diese Iterator<>-Instanz kann die erweiterte for-Schleife in weiterer Folge durch Aufrufe von hasNext und next wie über eine Standard-Collection iterieren. BufferedReader werden typischerweise zeilenweise gelesen, sodass die Iteration vom Typ String - bzw. String-Array im Falle einer tabellenartigen Struktur (CSV-Datei) - ist.

<hr>
[languages.txt](languages.txt) Reference: [https://github.com/csurfer/gitlang/blob/master/languages.txt](https://github.com/csurfer/gitlang/blob/master/languages.txt)