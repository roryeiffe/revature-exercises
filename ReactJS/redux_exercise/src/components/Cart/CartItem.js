import React from 'react';
import { useDispatch } from 'react-redux';

const CartItem = (props) => {

    const dispatch = useDispatch();

    // dispatch the remove from cart action, passing in
    // the product name as the payload
    const removeProductHandler = (product) => {
        dispatch({type: "REMOVE_FROM_CART", payload: product.productName})
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
          <a onClick = {removeProductHandler.bind(this,props.data)} className="btn btn-danger">
            Remove From Cart
          </a>
        </div>
      </div>
    </div>
    )
}

export default CartItem;