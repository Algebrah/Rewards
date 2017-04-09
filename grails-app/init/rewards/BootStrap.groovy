package rewards

class BootStrap {

    def init = { servletContext ->
        new Product(name: "Morning Blend", sku: "MB01", price: 14.95).save()
        new Product(name: "Colombian", sku: "CC01", price: 10.95).save()
    }
    def destroy = {
    }
}
