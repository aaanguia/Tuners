import React from "react"
import "../../App.css"
import ItemCard from "../ItemCard"
import { useAxiosGet } from "../../Requests/HttpsRequests"

function Catalog() {
  const url = "https://alex.ee-cognizantacademy.com/inventory"

  let items = useAxiosGet(url)

  let content = null

  if (items.error) {
    content = (
      <div>
        <div>There was an error please refresh or try again later.</div>
      </div>
    )
  }

  if (items.data) {
    content = items.data.map((item) => (
      <div key={item._id} className="flex-no-shrink w-full md:w-1/4 md:px-3">
        <ItemCard product={item} />
      </div>
    ))
  }

  return (
    <>
      <h1 className="catalog">CATALOG</h1>
      <div className="md:flex flex-wrap md:-mx-3">{content}</div>
      <div
        className="clearfix"
        style={{
          content: "",
          clear: "both",
          display: "table",
        }}
      ></div>
    </>
  )
}

export default Catalog
