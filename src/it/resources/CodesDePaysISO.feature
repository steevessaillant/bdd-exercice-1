# language: fr
# Given  = Etant donné que
# When  = Lorsque
# Then  = Alors
Fonctionnalité: Retourne le code ISO- 2 caracteres pour un pays

  Règle: Le code iso est une code a 2 lettre

    Plan du Scénario: Transformation du nom de pays en code de pays
      Soit que l'on as comme pays "<pays>"
      Alors le résultat doit être "<code>"

      Exemples:
        | pays          | code |
        | Canada        | CA   |
        | United States | US   |
        | France        | FR   |