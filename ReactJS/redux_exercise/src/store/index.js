import {createStore} from 'redux';

const initialState = {
    // create initial cart with one item:
    cart: [
        {
            "quantity": 100,
            "description": "Bring home the yummy taste of green chicken fried in fresh refined oil with the taste of Afghani",
            "status": true,
            "position": 1,
            "created": "2019-12-02T05:35:50.063Z",
            "_id": "5de4a2b6a32d0906687812ea",
            "catId": 1,
            "subId": 1,
            "productName": "Chicken Hariyali 150 grams",
            "image": "chicken_hariyali.jpeg",
            "unit": "1",
            "price": 80,
            "mrp": 100,
            "__v": 0
          },
    ]
}

// reducer:
const cartReducer = (state = initialState, action) => {
    if(action.type === 'ADD_TO_CART'){
        // add item to cart:
        return {
            ...state,
            cart: [...state.cart, action.payload]
        }
    }
    else if(action.type === 'REMOVE_FROM_CART'){
        // remove item from cart:
        return {
            ...state,
            // filter out all items with the same name:
            cart: state.cart.filter(item => item.productName !== action.payload)
        }
    }
    else {
        return state;
    }
}

const store = createStore(cartReducer);
export default store;