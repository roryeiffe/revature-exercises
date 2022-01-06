const NewsItem = (props) => {
  return (
    <div className = "col-sm-2 col-lg-4">
      <div className="card">
        <img className="card-img-top" src={props.data.urlToImage} alt="Card image cap" />
        <div className="card-body">
          <h5 className="card-title">{props.data.title}</h5>
          <p className="card-text">
            {props.data.description}
          </p>
        </div>
      </div>
    </div>
  );
};

export default NewsItem;
