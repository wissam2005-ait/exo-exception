 Gestion des exceptions

1. Le virement est validé avant toute modification des comptes avec `throw`.
2. Exceptions personnalisées : `BankingException` (hérite de `Exception`) et ses trois filles `InsufficientFundsException`, `TransferLimitExceededException`, `InvalidAccountException`.
3. `transfer` déclare `throws BankingException`.
4. Dans `Main`, plusieurs `catch` affichent un message précis ; le `finally` affiche « Traitement de la transaction terminé ».
5. Cohérence : un `try/catch` n'annule pas un débit déjà fait, donc seul le crédit est protégé par un `try/catch`.
6. Si le crédit échoue après le débit, le compte source est recrédité (compensation).
7. L'erreur initiale est conservée comme cause de l'exception relancée, jamais ignorée.
8. En production, on utiliserait une transaction de base de données (commit / rollback).
