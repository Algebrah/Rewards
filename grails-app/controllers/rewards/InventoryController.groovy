package rewards

class InventoryController {

    def index() {

            render "Hello There!"

    }

    def edit() {

        def productName = "Breakfast Blend"
        def sku = "BB01"
        [product: productName, sku:sku]

    }

    def remove() {

            render "You now have one less than before"
    }

    def list() {
        def allProducts = Product.list()
        [allProducts: allProducts]
    }

}
