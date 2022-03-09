# Bridge für logger.ConsoleLogger oder Konfigurationsverwaltung

Die Clients/Aufrufer des Loggers bzw. der Konfigurationsverwaltung sollen indirekt auf diese zugreifen. Dazu ist eine Bridge-Klasse zu erstellen, über die auf den tatsächlichen logger.ConsoleLogger indirekt zugegriffen wird. Die Bridge ist typkonform zum gekapselten Objekt.
Bei zusätzlichem Vorhandensein einer set-Methode könnte das referenzierte Objekt sogar ausgetauscht werden.
