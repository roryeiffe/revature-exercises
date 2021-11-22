import React, {useState} from 'react';

const Post = (props) => {
    return (
        <tr>
            <td>{props.data.title}</td>
            <td>{props.data.body}</td>
        </tr>
    )
}

export default Post;