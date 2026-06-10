const product={
    name:"laptop",
    price: 50000

};
// Function to read a property using Reflect.get()
function readProperty(obj,key)
{
    const value=Reflect.get(obj,key);
    console.log(`Read -> ${key}: ${value}`);
    return value;
}
// function to write a property using Reflect.set()
function writeProperty(obj,key,value)
{
    Reflect.set(obj,key,value);
    console.log(`write -> ${key}: ${value}`);
}

// Read operations
readProperty(product, "name");
readProperty(product, "price");

// Write operations
writeProperty(product, "price", 55000);
writeProperty(product, "category", "Electronics");

// Verify updated values
readProperty(product, "price");
readProperty(product, "category");