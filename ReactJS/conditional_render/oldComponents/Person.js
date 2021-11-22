import React from 'react';

const Person = () => {
    const names = ['Mark', 'Paul', 'Watson', 'John'];

    return (
        <div>
            <h1>List of Names</h1>
            <ul>
                {names.map(item => <li>{item}</li>)}
            </ul>
        </div>
    )
}

export default Person;