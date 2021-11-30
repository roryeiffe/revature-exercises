import Products from "./Products/Products.js";
import Cart from "./Cart/Cart.js";

const HomePage = () => {
  return (
    <div>
      <h1>Home Page</h1>
      <div className="row">
        <div className="col-md-3">
            <h1>Products</h1>
          <Products />
        </div>
        <div className="col-md-3">
          <h1>Cart</h1>
          <Cart />
        </div>
      </div>
    </div>
  );
};

export default HomePage;
