import React, { useState, useEffect } from "react";
import { useSelector } from "react-redux";
import CartItem from "./CartItem";

const Cart = () => {
  // get the cart from the redux store
  const cart = useSelector((state) => state.cart);

  return (
    <div>
      {cart.map((product) => (
        <CartItem data={product} />
      ))}
    </div>
  );
};
export default Cart;
