# Risoluzione Esercizio:<br>
Esercizio: Gestione delle Eccezioni in un Sistema di Prenotazioni<br>
Descrizione:<br>
    Devi sviluppare un semplice sistema di prenotazioni per un teatro.<br>
    Il sistema permette agli utenti di prenotare un posto specifico e tiene traccia dei posti già occupati.<br>
    Dovrai implementare una gestione delle eccezioni per evitare prenotazioni non valide.<br>
Classe Teatro<br>
    Contiene una proprietà di tipo String (nome);<br>
    Contiene un array di booleani (posti[]), in cui true indica che
        il posto è occupato e false che è disponibile.<br>
    Ha un costruttore che chiede come paramentro nome e numeroPosti e
        crea un array di lunghezza numeroPosti e inizializza tutti i posti come disponibili(false).<br>
    Metodo prenotaPosto(int numeroPosto), che:<br>
        Lancia un'eccezione se il numero del posto è fuori dall'intervallo valido.<br>
        Lancia un'eccezione se il posto è già prenotato.<br>
        Se la prenotazione è valida, segna il posto come occupato e conferma la prenotazione.<br>
Eccezioni Personalizzate:<br>
    PostoNonValidoException: viene lanciata quando il numero di posto non esiste.<br>
    PostoGiaOccupatoException: viene lanciata quando si tenta di prenotare un posto già occupato.<br>
Classe Main<br>
    Chiede all’utente tramite scanner di inserire un numero di posto da prenotare.<br>
    Gestisce le eccezioni e stampa messaggi adeguati all’utente.<br>
