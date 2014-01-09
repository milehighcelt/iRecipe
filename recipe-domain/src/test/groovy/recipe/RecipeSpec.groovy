package recipe

import spock.lang.Specification


class RecipeSpec extends Specification {


    def testStoreRecipeName() {

        def recipeName = "new Recipe"

        def recipe = new Recipe(name: recipeName)

        expect:
        recipe.name == recipeName
    }

}
