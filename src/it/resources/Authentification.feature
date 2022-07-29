# language: fr
Fonctionnalité: Retrait d'un distributeur de billets / guichet automatique
# Billets : JIR-0001, JIR-0002
  @fumigatoire
  Scénario: Éric veut retirer de l'argent de son compte bancaire à un guichet automatique
    Etant donné que Eric a une carte de crédit ou de débit valide
    Et que le solde de son compte est de 100 $
    Quand il insère sa carte
    Et retire 45 $
    Alors le guichet automatique renvoie 45 $
    Et le solde de son compte est de 55 $

  @regression @regle @transaction @refus
  Règle: ORG-REGLES-GA
  - Si un titulaire de compte dont le solde courant est inférieur à
  le montant demandé ne doit pas être autorisé à être retiré et le message renvoyé doit
  être "Désolé, la transaction est annulée car vous ne pouvez pas retirer un montant supérieur à votre solde réel"

  Contexte:
    Étant donné que Eric a une carte de crédit ou de débit valide
    Et que le solde de son compte est de 100 $

  Exemple: Éric retire plus d'argent que son solde en contient de son compte bancaire à un guichet automatique
    Quand il insère sa carte
    Et il retire 150 $
    Alors le guichet automatique renvoie 45 $
    Et le solde de son compte est de 55 $
    #Alors la transaction est refusee
    #Et le message suivant est retourne au client SOLDE INSUFFISANT
  Exemple: Éric retire avec son solde de 0.00$ de son compte bancaire à un guichet automatique
    Quand il insère sa carte
    Et il retire 50 $
