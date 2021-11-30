import React from "react";
import { useDispatch } from "react-redux";

const ProductItem = (props) => {

    const dispatch = useDispatch();

    // when we click a product, we want to add it to the cart
    const addProductHandler = (product) => {
        // dispatch the add to cart action:
        dispatch({type: "ADD_TO_CART", payload: product})
    }

    return (
        <div className="col-lg-12">
      <div className="card">
        <img
          src={"http://rjtmobile.com/grocery/images/" + props.data.image}
          className="card-img-top"
          alt="..."
        />
        <div className="card-body">
            <h2>{props.data.productName}</h2>
          <h3>
            ${props.data.price} <del>${props.data.mrp}</del>
          </h3>
          <h5 className="card-title">{props.data.unit}</h5>
          <p className="card-text">{props.data.description}</p>
          <a onClick = {addProductHandler.bind(this,props.data)} className="btn btn-primary">
            Add to Cart
          </a>
        </div>
      </div>
    </div>
    )
}

export default ProductItem;