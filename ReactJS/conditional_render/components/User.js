import React , {useState} from 'react';

const User = () => {

    const [name, setName] = useState('Mark');

    function onClickHandler() {
        setName("Paul");
    }

    return (
        <div>
            <h1>Welcome {name}</h1>
            <button className = "primary" onClick = { onClickHandler }>Change</button>
        </div>
    )
}

export default User;