# spring-eureka
Repo dove configuro un server eureka (discovery service)


Qual è l'utilizzo di Eureka Server in Microservices 
AUTORE: SOUMITRA - QUAL È L'UTILIZZO DI EUREKA SERVER IN MICROSERVICES 
Qui spiegherò cos'è Eureka Server e perché dobbiamo utilizzare Eureka server nell'architettura dei Microservices.

Cos'è Eureka Server? Il server Eureka non è altro che un'implementazione del discovery pattern service (https://microservices.io/patterns/server-side-discovery.html), in cui i microservices possono registrarsi in modo che gli altri possano scoprirli.

Questo server contiene informazioni sulle applicazioni client di servizio. Ogni microservice si registra nel server Eureka e il server Eureka conosce tutte le applicazioni client in esecuzione su ciascuna porta e indirizzo IP. Questo server è anche noto come server di discovery.

L'annotazione @EnableEurekaServer viene utilizzata per fare in modo che la tua applicazione Spring Boot agisca come un Eureka Server.

Il server Eureka è un prodotto Netflix OSS e Spring Cloud offre un modo dichiarativo per registrare e invocare servizi tramite annotazione Java.

Perché abbiamo bisogno di Eureka Server? Per capire perché è necessario il server Eureka nell'architettura dei microservices, capiamo come un servizio chiama un altro servizio, di solito utilizzando un endpoint REST per la comunicazione.

Supponiamo che dobbiamo chiamare il servizio di elaborazione delle buste paga per ottenere le informazioni sulla busta paga di un dipendente. Il servizio di elaborazione delle buste paga è distribuito sull'host localhost e sulla porta 9000. Pertanto, otteniamo queste informazioni sulla busta paga di un dipendente passando la chiave primaria del dipendente. Quindi chiamiamo semplicemente quanto segue:

http://localhost:9000/payroll/245676 o http://127.0.0.1/payroll/245676

Dove localhost o 127.0.0.1 è il nome host o l'indirizzo IP e payroll è il contesto del servizio di buste paga, 245676 è la chiave primaria del dipendente.

Ma aspetta, questo è possibile solo quando conosci il nome host o l'indirizzo IP in anticipo, quindi puoi configurare il tuo URL. Quindi, qui il nome host o l'indirizzo IP è un vincolo o un punto critico.

Se l'indirizzo IP di un server/container è fisso, allora puoi utilizzare questo approccio per chiamare facilmente il tuo servizio, ma cosa succede quando il tuo indirizzo IP e il nome host sono imprevedibili?

Oggi, su una piattaforma cloud, è ovvio che tutti i server o i container utilizzino IP dinamici per il ridimensionamento automatico. E la cosa interessante è che nell'architettura dei microservices, il principio chiave è che il tuo servizio può ridimensionarsi automaticamente in base al carico, quindi le piattaforme cloud sono ideali per i microservices.

Di conseguenza, inserire l'indirizzo IP del servizio dipendente nel file di configurazione non è una soluzione. Abbiamo bisogno di una tecnica più sofisticata per identificare il servizio e qui entra in gioco il server Eureka.

Grazie per la lettura.
