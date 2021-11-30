import {React, useState, useEffect} from 'react';
import axios from 'axios';
import ProductItem from './ProductItem';

const Products = () => {
    const [products, setProducts] = useState([]);
    useEffect(() => {
        axios.get('http://apolis-grocery.herokuapp.com/api/products')
        .then(response => {
            setProducts(response.data.data)
        })
        .catch(error => console.log(error))
    }, [])
    return (
        <div>
            {products.map(product => (
                <ProductItem data = {product} />
            ))}
        </div>
    )
}


export default Products;