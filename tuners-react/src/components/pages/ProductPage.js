import React from "react"
import { useParams } from "react-router"
import { useAxiosGetProductById } from "../../Requests/HttpsRequests"
import "./CSS/ProductPage.css"
function ProductPage(props) {
  const { id } = useParams()

  const url = `https://alex.ee-cognizantacademy.com/inventory/${id}`

  let item = useAxiosGetProductById(url)

  let content = null

  if (item.error) {
    content = (
      <div>
        <div>There was an error getting specific image</div>
      </div>
    )
  }

  if (item.data) {
    content = (
      <div className="app">
        <div className="details" key={item.id}>
          <div className="big-img">
            <img src={item.data.img} alt="" />
          </div>

          <div className="box">
            <div className="row">
              <h2>{item.data.itemName}</h2>
              <span>${item.data.price}</span>
            </div>
            <p>{item.data.description}</p>
            <p>{item.data.quantity}</p>

            <button className="cart">Add to cart</button>
          </div>
        </div>
      </div>
    )
  }

  return (
    <>
      <div>{content}</div>
    </>
  )
}
export default ProductPage
